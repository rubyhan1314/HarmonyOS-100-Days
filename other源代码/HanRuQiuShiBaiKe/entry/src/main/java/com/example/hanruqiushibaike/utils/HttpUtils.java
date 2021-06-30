package com.example.hanruqiushibaike.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpUtils {
	/**
	 * 根据网络接口，获取指定的InputStream
	 * @param baseUrl
	 * @return
	 */
	
	public static InputStream getInputStream(String baseUrl){
		try {
			URL url = new URL(baseUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko");
			if(connection.getResponseCode()==HttpURLConnection.HTTP_OK){
				return connection.getInputStream();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 根据网络接口，获取数据，byte数组
	 * @param baseUrl
	 * @return
	 */
	public static byte[] getDataFromNet(String baseUrl){
		InputStream inputStream = getInputStream(baseUrl);
		if(inputStream!=null){
			byte[]bs = new byte[1024];
			int len=0;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			try {
				while((len = inputStream.read(bs))!=-1){
					baos.write(bs, 0, len);
				}
				return baos.toByteArray();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	/**
	 * 根据网络接口，获取json数据
	 * @param baseUrl
	 * @return
	 */
	public static String getJsonFromNet(String baseUrl){
		byte[] data = getDataFromNet(baseUrl);
		if(data!=null){
			return new String(data);
		}
		return null;
	}
}
