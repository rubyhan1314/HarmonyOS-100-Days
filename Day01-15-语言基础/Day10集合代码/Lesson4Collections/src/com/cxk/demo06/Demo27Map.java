package com.cxk.demo06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * map
 * @author hanru
 *
 */
public class Demo27Map {

	public static void main(String[] args) {
		//1.创建一个map，存储人的信息：姓名：王二狗，年龄：30，性别：男，生日：1999-9-9
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", "王二狗");//String-->Object
		map1.put("age", 30);//int-->Integer-->Object
		map1.put("sex", '男');//char-->Character-->Object
		map1.put("birthday", "1990-9-9");//String-->Object
		
		System.out.println(map1);
		
		//keySet()-->Set集合，将map中所有的key，都存储到一个set集合中
		Set<String> keySet = map1.keySet();
		System.out.println(keySet);
		//遍历这个keySet
		for(String key:keySet){
			System.out.println(key +"\t"+map1.get(key));
		}
		
		//2.存储3个人的信息
		//李小花，28，女，2001-10-10
		Map<String, Object> map2 = new HashMap<>();
		map2.put("name", "李小花");
		map2.put("age", 28);
		map2.put("sex", '女');
		map2.put("birthday", "1992-10-10");
		
		System.out.println(map1);
		System.out.println(map2);
		
		Map<String, Object>map3 = new HashMap<>();
		map3.put("name", "rose");
		map3.put("age", 18);
		map3.put("sex", '女');
		map3.put("birthday", "2002-10-10");
		System.out.println(map3);
		
		System.out.println("------------------------------");
		//list存啥咧-->存储Map集合
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		for(int i=0;i<list.size();i++){//0,1,2
			Map<String, Object> map = list.get(i);
			//遍历map
			Set<String> keySet2 = map.keySet();
			Iterator<String> it = keySet2.iterator();
			while(it.hasNext()){
				String key = it.next();
				System.out.println(key+"\t"+map.get(key));
			}
			System.out.println("*******************************");
		}
	}

}
