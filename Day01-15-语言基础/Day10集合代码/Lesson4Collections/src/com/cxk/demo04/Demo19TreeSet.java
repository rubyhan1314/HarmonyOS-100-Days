package com.cxk.demo04;

import java.util.Set;
import java.util.TreeSet;

public class Demo19TreeSet {

	public static void main(String[] args) {
		/*
		 * TreeSet，作为Set的实现类，
		 * 		- 去重
		 * 		- 有序存储 ?
		 */
		Set<Integer> set1 = new TreeSet<>();
		set1.add(10);//自动装箱：int -- > Integer
		set1.add(7);
		set1.add(16);
		set1.add(5);
		System.out.println(set1.add(16));//false，无法存储重复的元素
		
		System.out.println(set1.size());
		
		System.out.println(set1); //[5, 7, 10, 16]
		
		set1.add(20);
		set1.add(14);
		set1.add(8);
		System.out.println(set1);//[5, 7, 8, 10, 14, 16, 20]
		
		System.out.println("-----------------------------------");
		Set<String> set2 = new TreeSet<>();
		set2.add("abc");
		set2.add("abe");
		set2.add("ddd");
		set2.add("ccc");
		set2.add("abc");
		System.out.println(set2.size());//4
		System.out.println(set2); //[abc, abe, ccc, ddd]
		

		
	}

}
