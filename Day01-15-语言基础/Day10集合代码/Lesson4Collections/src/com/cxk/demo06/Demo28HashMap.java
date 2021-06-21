package com.cxk.demo06;

import java.util.HashMap;
import java.util.HashSet;

public class Demo28HashMap {

	public static void main(String[] args) {
		//1.创建Map集合，key：整数，value：人对象
		//key一定是去重的。
		
		HashMap<Integer, Person> map1 = new HashMap<Integer, Person>();
		map1.put(1, new Person("张三", 20));
		map1.put(2, new Person("李四", 25));
		map1.put(3, new Person("王五", 28));
		System.out.println(map1);
		map1.put(1, new Person("赵六", 40));
		System.out.println(map1);
		
		//2.Person为key
		/*
		 * hashMap的key，如何去重？同hashSet去重原理相同。
		 * 底层自动调用hashCode和equals()
		 * 
		 * hashCode：
		 * 	相同的对象，哈希值必须相同
		 * 	不同的对象，哈希值尽量不同
		 * 
		 * equals：
		 * 	相同的对象：必须true
		 * 	不同的对象：必须false
		 */
		HashMap<Person, String> map2 = new HashMap<>();
		map2.put(new Person("王二狗", 30), "矮矬穷");
		map2.put(new Person("李小花", 28), "美美哒");
		map2.put(new Person("王二狗", 30), "高富帅");
		System.out.println(map2.size());
		System.out.println(map2);
		

		
	}

}
