package com.example.hanruqiushibaike.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 解析糗百的json数据
 */
public class JsonParseUtils {
	public static List<Map<String, String>> parseJsonToList(String json){
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		try {
			JSONArray jsonArray = new JSONObject(json).getJSONArray("items");
			for(int i=0;i<jsonArray.length();i++){
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				Map<String, String> map = new HashMap<String, String>();
				int id = jsonObject.optInt("id");
				map.put("id", id+"");
				map.put("content", jsonObject.optString("content"));
				JSONObject jsonObject2 = jsonObject.optJSONObject("user");
				if(jsonObject2!=null){
					map.put("login", jsonObject2.optString("login"));
				}
				list.add(map);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return list;
	}
}
