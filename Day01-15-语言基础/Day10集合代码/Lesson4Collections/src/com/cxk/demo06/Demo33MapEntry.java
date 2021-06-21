package com.cxk.demo06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * Map集合的几种遍历方式
 * @author hanru
 *
 */
public class Demo33MapEntry {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("王二狗", "天天挨揍的产品经理");
		map.put("李小花", "天天揍王二狗");
		map.put("Ruby", "天天看李小花揍王二狗");
		//方法一：先获取所有的key，到一个set中，然后根据key获取value
		/*
		 * 获取map中的每一个元素：迭代map集合？
		 * 1.map中的所有的key，存储到一个Set中
		 * 		A：keySet()--->Set集合
		 * 		B：iterator()-->迭代获取每一个key
		 * 		C：根据key获取map中对应的value
		 */
		System.out.println("1-----------------------------");
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key =  it.next();
			System.out.println(key+"\t"+map.get(key));
		}
		
		//方法二：for-each也可以
		System.out.println("2-----------------------------");
		for(String key:map.keySet()){
			System.out.println(key+"\t"+map.get(key));
		}
		
		
		/*
		 * map中存储了3个键值对：
		 * 
		 * 3个键值对――>3个Entry对象
		 * 
		 * map：
		 * 	key-->value
		 * 	key-->value
		 * 	key-->value
		 * 	...
		 * 
		 * Set:
		 * 	entry:key,value
		 * 	entry:key,value
		 * 	entry:key,value
		 * 	....
		 * 
		
		 * 
		 * 2.map中的键值对组合entry，存储到一个Set中
		 * 		A：entrySet()--->Set集合
		 * 		B：iterator()-->迭代获取每一个entry
		 * 		C：根据entry对象，获取里面的key和value
		 * 
		 * 
		 * 
		 * 注意点：
		 * iterator()--->Collection接口
		 * 		List，Set。。。ArrayList，linkedList,HashSet,TreeSet....
		 * 
		 * map是没有迭代器
		 */
		//方法3：Entry：
		System.out.println("3-----------------------------");
		//step1：获取map集合对应set：entry
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		//step2：操作set集合，获取迭代器对象
		Iterator<Entry<String, String>> it2 = entrySet.iterator();
		//step3：循环遍历迭代
		while(it2.hasNext()){
			//调用next()，获取Set集合中对象：entry
			Entry<String, String> entry = it2.next();
			//step4：操作entry，获取key和value
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		System.out.println("4-----------------------------");
		/*
		 * for(数据类型 变量名：数组/集合){
		 * }
		 */
		for(Entry<String,String> entry:map.entrySet()){//集合Set<Entry>
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		
		
	}

}
