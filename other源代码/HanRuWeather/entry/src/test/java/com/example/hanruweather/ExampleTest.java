package com.example.hanruweather;

import com.example.hanruweather.constant.Constant;
import com.example.hanruweather.utils.DateUtils;
import com.example.hanruweather.utils.JsonUtils;
import com.example.hanruweather.utils.NetDownLoadUtils;
import com.example.hanruweather.utils.TextUtils;
import ohos.hiviewdfx.HiLog;
import ohos.utils.zson.ZSONArray;
import ohos.utils.zson.ZSONObject;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ExampleTest {
    @Test
    public void onStart() {
    }

    @Test
    public void testPinYin(){
        String result = TextUtils.convertToHanYuPinYin("北京");
        System.out.println(result);
    }

    @Test
    public void testGetPinYin(){
        String result = TextUtils.getPinYin("北京,你好",1);
        System.out.println(result);
    }

    @Test
    public void testDouble(){
        String s1 = String.format("%.2f",303.199999999-273.15);
        System.out.println(s1);
        System.out.printf("%.2f",303.199999999-273.15);
    }

    @Test
    public void testJson(){
//        String forecastUrl = "https://api.openweathermap.org/data/2.5/forecast?q=beijing&appid=accf59680d5b2039f92c468d4ac8e634";
//        String jsonData2 = NetDownLoadUtils.downLoadWeatherData(forecastUrl);

        String jsonData2 = "{\"coord\":{\"lon\":116.3972,\"lat\":39.9075},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10d\"}],\"base\":\"stations\",\"main\":{\"temp\":302.63,\"feels_like\":302.81,\"temp_min\":302.09,\"temp_max\":303.27,\"pressure\":1005,\"humidity\":45,\"sea_level\":1005,\"grnd_level\":1000},\"visibility\":10000,\"wind\":{\"speed\":0.25,\"deg\":93,\"gust\":0.63},\"rain\":{\"1h\":0.18},\"clouds\":{\"all\":17},\"dt\":1625628286,\"sys\":{\"type\":2,\"id\":2000403,\"country\":\"CN\",\"sunrise\":1625604755,\"sunset\":1625658336},\"timezone\":28800,\"id\":1816670,\"name\":\"Beijing\",\"cod\":200}";
        System.out.println("jsonData2-->" + jsonData2);
        if (jsonData2 != null) {
            List<Map<String, String>> list = JsonUtils.parseForecastWeatherJsonToList(jsonData2);
            System.out.println("list-->" + list);
            ZSONArray array = new ZSONArray();
            for (int i = 0; i < list.size(); i++) {
                array.add(list.get(i));
            }
            System.out.println("array-->" + array);
//            reply.writeString(ZSONObject.toZSONString(array));
        }
    }

    @Test
    public void testDate(){
        String currentDate = DateUtils.getCurrentDate();
        System.out.println(currentDate);

    }
}
