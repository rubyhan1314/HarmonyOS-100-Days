package com.cxk.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo09Generics {

	public static void main(String[] args) {
		//创建一个集合容器，声明泛型为Person，存储3个人的对象，然后使用for-each遍历输出。
		
		Collection<Person> c1 = new ArrayList<Person>();
		Person p1 = new Person("王二狗", 18);
		Person p2 = new Person("李小花",19);
		Person p3 = new Person("Ruby",20);
		c1.add(p1);//p1 的地址
		c1.add(p2);//p2的地址
		c1.add(p3);
		c1.add(new Person("铁柱", 17));//匿名对象的地址
		for(Person p:c1){
			System.out.println(p);
		}
		
		System.out.println("------------");
		//使用迭代器输出
		Iterator<Person> it = c1.iterator();
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p);
		}
		
	}

}
