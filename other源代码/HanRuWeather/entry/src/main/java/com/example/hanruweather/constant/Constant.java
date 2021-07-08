package com.example.hanruweather.constant;

/**
 * 常量
 */
public class Constant {
    // 请求当天当天气
    public static final int CURRENT = 1001;

    // 请求未来预测的4天
    public static final int FORECAST = 1002;

    // 获取数据成功
    public static final int SUCCESS = 1;

    // 获取数据失败
    public static final int FAIL = 0 ;

    // 天气预报的base地址
    public static final String BASE_URI = "https://api.openweathermap.org/data/2.5/";

    //    private static final String API_KEY ="appid={{Add your Key}}";
    public static final String API_KEY = "appid=accf59680d5b2039f92c468d4ac8e634";

    // 预测4天
    public static final String FORECAST_URL = "forecast";

    // 当天天气
    public static final String WEATHER_URL = "weather";

}
