package com.example.hanruweather;


import com.example.hanruweather.constant.Constant;
import com.example.hanruweather.utils.DateUtils;
import com.example.hanruweather.utils.JsonUtils;
import com.example.hanruweather.utils.NetDownLoadUtils;
import com.example.hanruweather.utils.TextUtils;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.rpc.*;
import ohos.utils.zson.ZSONArray;
import ohos.utils.zson.ZSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WeatherServiceAbility extends Ability {

    private static final HiLogLabel LABEL_LOG = new HiLogLabel(3, 0x00201, "WeatherServiceAbility");

    private MyRemote remote = new MyRemote();

    private String city = "";

    @Override
    protected IRemoteObject onConnect(Intent intent) {

        super.onConnect(intent);

        HiLog.info(LABEL_LOG, "onConnect()---->");
        return remote.asObject();

    }

    class MyRemote extends RemoteObject implements IRemoteBroker {


        MyRemote() {
            super("MyService_MyRemote");
            HiLog.info(LABEL_LOG, "MyRemote()----->");
        }

        // 设置接收请求的条目。
        // int code:表示从对等端发送的服务请求代码。
        @Override
        public boolean onRemoteRequest(int code, MessageParcel data, MessageParcel reply, MessageOption option) {

            HiLog.info(LABEL_LOG, "onRemoteRequest---->data" + data);
            String cityData = data.readString();
            HiLog.info(LABEL_LOG, "onRemoteRequest---->cityData" + cityData);
            city = TextUtils.convertToHanYuPinYin(cityData);
            HiLog.info(LABEL_LOG, "onRemoteRequest---->" + code + ",--->cityData:" + cityData + "---city:" + city);
            switch (code) {

                case Constant.CURRENT:
                    // 下载当前的天气
                    String weatherUrl = concatUrl(Constant.BASE_URI + Constant.WEATHER_URL, new String[]{"q=" + city, Constant.API_KEY});
                    String jsonData = NetDownLoadUtils.downLoadWeatherData(weatherUrl);
                    HiLog.info(LABEL_LOG, "json-->" + jsonData);
                    Map<String, String> map = JsonUtils.parseCurrentWeatherJsonToMap(jsonData);
                    if (map.size() == 0) {
                        reply.writeInt(Constant.FAIL);
                        return false;
                    }
                    map.put("city", cityData);
                    reply.writeInt(Constant.SUCCESS);
                    reply.writeString(ZSONObject.toZSONString(map));
                    HiLog.info(LABEL_LOG, "map-->" + map);

                    break;

                case Constant.FORECAST:
                    // 下载预测未来5天的天气
                    String forecastUrl = concatUrl(Constant.BASE_URI + Constant.FORECAST_URL, new String[]{"q=" + city, Constant.API_KEY});
                    String jsonData2 = NetDownLoadUtils.downLoadWeatherData(forecastUrl);
                    HiLog.info(LABEL_LOG, "jsonData2-->" + jsonData2);

                    List<Map<String, String>> list = JsonUtils.parseForecastWeatherJsonToList(jsonData2);
                    HiLog.info(LABEL_LOG, "onRemoteRequest--list-->" + list);
                    List<Map<String, String>> subList = getDataList(list);
                    if (subList.size() == 0) {
                        reply.writeInt(Constant.FAIL);
                        return false;
                    }
                    ZSONArray array = new ZSONArray();
                    // 处理数据
                    for (int i = 0; i < subList.size(); i++) {
                        array.add(subList.get(i));
                    }
                    HiLog.info(LABEL_LOG, "onRemoteRequest--array-->" + array);
                    reply.writeInt(Constant.SUCCESS);
                    reply.writeString(ZSONObject.toZSONString(array));

                    break;

                default: {
                    reply.writeString("service not defined");
                    return false;
                }
            }
            return true;
        }

        @Override
        public IRemoteObject asObject() {
            return this;
        }
    }

    /**
     * 处理一下得到的json数据的集合，因为得到的数据是未来5天每隔3小时测量的数据，我们只想要每一天的一个数据，所以取每一天12：00的数据，其他数据移除掉即可。
     *
     * @param list
     * @return
     */
    public List<Map<String, String>> getDataList(List<Map<String, String>> list) {
        List<Map<String, String>> subList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Map<String, String> map = list.get(i);
            String dt_txt = map.get("dt_txt");

            if (dt_txt.endsWith("12:00:00") && !dt_txt.startsWith(DateUtils.getCurrentDate())) {
                subList.add(map);
            }
        }
        HiLog.info(LABEL_LOG, "处理后的list-->" + subList.size() + "," + subList);
        return subList;
    }

    // 拼接URL
    private String concatUrl(String link, String params[]) {
        StringBuilder urlFinal = new StringBuilder();
        urlFinal.append(link);
        urlFinal.append("?");
        for (int i = 0; i < params.length; i++) {
            urlFinal.append("&");
            urlFinal.append(params[i]);

        }
        HiLog.info(LABEL_LOG, "urlFinal------ " + urlFinal.toString());
        return urlFinal.toString();
    }


}

