package com.cxk.demo06;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo29LinkedHashMap {

	public static void main(String[] args) {
		// 1.先看看HashMap
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("Ruby", "正在写下这篇文档的小美妞儿");
		map1.put("王二狗", "一个每天特别欢乐的小逗比");
		map1.put("程序咖", "学IT，先搜程序咖。");

		// 遍历
		for (Map.Entry<String, String> me : map1.entrySet()) {
			System.out.println(me.getKey() + "-->>" + me.getValue());
		}
		System.out.println("---------------------------------------");
		// 2.再来看看LinkedHashMap
		LinkedHashMap<String, String> map2 = new LinkedHashMap<>();
		map2.put("Ruby", "正在写下这篇文档的小美妞儿");
		map2.put("王二狗", "一个每天特别欢乐的小逗比");
		map2.put("程序咖", "学IT，先搜程序咖。");
		// 遍历
		for (Map.Entry<String, String> me : map2.entrySet()) {
			System.out.println(me.getKey() + "-->>" + me.getValue());
		}

	}

}
