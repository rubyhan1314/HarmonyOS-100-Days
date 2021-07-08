package com.example.hanruweather.utils;

import ohos.hiviewdfx.HiLog;
import ohos.net.NetHandle;
import ohos.net.NetManager;
import ohos.net.NetStatusCallback;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * 网络下载天气预报数据的工具类
 */
public class NetDownLoadUtils {

    /**
     * 根据指定的url，下载天气预报的数据：json格式
     * @param weatherUrl
     * @return
     */
    public static String downLoadWeatherData(String weatherUrl){
        NetManager netManager = NetManager.getInstance(null);
        if (!netManager.hasDefaultNet()) {
            return null;
        }
        NetHandle netHandle = netManager.getDefaultNet();
        // Listen to network state changes.
        NetStatusCallback callback = new NetStatusCallback() {
            // Override the callback for network state changes.
        };

        netManager.addDefaultNetStatusCallback(callback);
        // Obtain a URLConnection using the openConnection method.
        HttpURLConnection connection = null;
        try {
            URL url = new URL(weatherUrl);
            URLConnection urlConnection = netHandle.openConnection(url,
                    java.net.Proxy.NO_PROXY);
            if (urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
            }
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                br.close();
                return sb.toString();

            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return "IOException";
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

}
