package com.cxk.demo06;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo34HashTable {

	public static void main(String[] args) {
		/*
		 * HashMap，支持null
		 * 
		 * HashTable，不支持null，抛出异常：NullPointerException
		 */
		HashMap<String, String> map = new HashMap<>();
		map.put("A", "程序咖");
		map.put("B", "Ruby");
		map.put("C", null);//null对象
		map.put("D", null);
		System.out.println(map);
		map.put(null, "haha");
		System.out.println(map);
		map.put(null, "hehe");
		System.out.println(map);
		
		
		Hashtable<String, String> table = new Hashtable<>();
		table.put("AA", "程序咖");
		table.put("BB", "Ruby");
//		table.put("CC", null);
//		table.put(null, "ddd");
		System.out.println(table);
		
	}

}
