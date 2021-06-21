package com.cxk.demo06;

import java.util.HashMap;
import java.util.Map;
/**
 * Map接口
 * @author hanru
 *
 */
public class Demo26Map {

	public static void main(String[] args) {
		/*
		 * Map，操作是键值对，成对的对象。
		 * key和value必须是一一对应的。
		 * key不能重复
		 */
		Map<String, String> map = new HashMap<>();
		/*
		 * 1.put(key,value)-->value
		 * 
		 * 将制定的参数键值对，存入map集合中。
		 * 存储的key不允许重复，如果重复，会覆盖原来的value值。
		 * 返回值是被替换的value。如果key不重复，就返回null
		 */
		String s1 = map.put("A", "aaa");
		String s2 = map.put("B", "bbb");
		String s3 = map.put("C", "ccc");
		String s4 = map.put("D", "ddd");
		System.out.println(map);//{A=aaa, B=bbb, C=ccc, D=ddd}
		System.out.println(s1+","+s2+","+s3+","+s4);//null,null,null,null
		String s5 = map.put("D", "XXX");
		System.out.println(map);//{A=aaa, B=bbb, C=ccc, D=XXX}
		System.out.println(s5);//ddd
		
		//2.clear(),清空map集合，就是删除所有的键值对
//		map.clear();
//		System.out.println(map);
		
		
		//3.containsKey(key)-->boolean，是否包含指定的key
		System.out.println(map.containsKey("D"));
		//4.containsValue(value)-->boolean,是否包含指定的value
		System.out.println(map.containsValue("ddd"));
		
		/*
		 * 5.get(key)-->value
		 * 根据key，获取它所对应的value值。
		 * 如果key不存在，返回null
		 */
		System.out.println(map.get("D"));//XXX
		System.out.println(map.get("DD"));//null
		
		if(map.containsKey("DD")){
			System.out.println(map.get("DD"));
		}else{
			System.out.println("map中查无此数据。。");
		}
		
		/*
		 * 6.remove(key)->value
		 * 从map中，根据指定的key，移出该键值对。返回值是被删除的value
		 * 如果map中没有这个key，返回值就是null。
		 */
		String s6 = map.remove("DD");
		System.out.println(map); //{A=aaa, B=bbb, C=ccc}
		System.out.println(s6); //XXX
		
		System.out.println(map.size());//4,获取map集合中，键值对的数量
	}

}
