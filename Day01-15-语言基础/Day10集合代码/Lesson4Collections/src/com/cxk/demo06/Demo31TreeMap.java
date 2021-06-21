package com.cxk.demo06;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo31TreeMap {

	public static void main(String[] args) {
		Map<Person, String> map  = new TreeMap<Person, String>();
		map.put(new Person("王二狗",28), "天天挨揍的产品经理");
		map.put(new Person("李小花", 18), "天天揍王二狗");
		map.put(new Person("Ruby", 25), "天天看李小花揍王二狗");
		map.put(new Person("Ruby", 25), "不看了。。");
		
//		System.out.println(map);
		//遍历这个map
		//1.获取所有的key
		Set<Person> keySet = map.keySet();
		//2.获取这个set上的iterator迭代器对象
		Iterator<Person> it = keySet.iterator();
		//3.遍历
		while(it.hasNext()){
			Person person = it.next();
			System.out.println(person+"\t"+map.get(person));
		}
		
		TreeSet<String> set = new TreeSet<>();
		set.add("aaa");
	}

}
