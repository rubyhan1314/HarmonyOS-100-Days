package com.example.hanruweather.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 解析json
 */
public class JsonUtils {

    /**
     * 解析当前的天气预报-->Map集合
     * @param json
     * @return
     */
    public static Map<String,String> parseCurrentWeatherJsonToMap(String json){


        Map<String,String> map = new HashMap<>();
        if(json==null|| "".equals(json)){
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(json);
            // 温度
            JSONObject main = jSONObject.getJSONObject("main");
            // 将开尔文转为摄氏度：开氏度 = 摄氏度+273.15。
            map.put("temp",String.format("%.2f",main.optDouble("temp")-273.15)); // 温度
            map.put("humidity",main.optString("humidity")); // 湿度

            JSONObject wind = jSONObject.getJSONObject("wind");
            map.put("speed",wind.optString("speed")); // 风速

            JSONObject sys = jSONObject.getJSONObject("sys");
            map.put("country", sys.optString("country"));

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return map;
    }


    /**
     * 解析未来预测的温度
     * @param json
     * @return
     */
    public static List<Map<String,String>> parseForecastWeatherJsonToList(String json){
        List<Map<String,String>> list = new ArrayList<>();
        if(json==null|| "".equals(json)){
            return list;
        }
        try {
            JSONArray jsonArray = new JSONObject(json).getJSONArray("list");
            for(int i=0;i<jsonArray.length();i++){
                JSONObject jSONObject = jsonArray.getJSONObject(i);
                Map<String,String> map = new HashMap<>();
                map.put("dt_txt",jSONObject.optString("dt_txt"));
                JSONObject main = jSONObject.getJSONObject("main");
                map.put("temp",String.format("%.2f",main.optDouble("temp")-273.15)); // 温度
                map.put("humidity",main.optString("humidity")); // 湿度
                JSONObject wind = jSONObject.getJSONObject("wind");
                map.put("speed",wind.optString("speed")); // 风速

                list.add(map);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }
}
