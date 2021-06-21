package com.cxk.demo04;

import java.util.HashSet;

public class Demo17HashSet {

	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		Person p1 = new Person("Ruby", 18);
		Person p2 = new Person("Ruby", 18);
		Person p3 = new Person("王二狗", 18);
		Person p4 = new Person("李小花", 17);
		
		boolean b1 = set.add(p1);
		boolean b2 = set.add(p2);
		boolean b3 = set.add(p3);
		boolean b4 = set.add(p4);
		System.out.println(set.size());
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
	
		
		
	}

}
