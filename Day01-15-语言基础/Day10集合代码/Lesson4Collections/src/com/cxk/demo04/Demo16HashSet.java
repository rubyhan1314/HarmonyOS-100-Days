package com.cxk.demo04;

import java.util.HashSet;
import java.util.Set;

public class Demo16HashSet {

	public static void main(String[] args) {
		/*
		 * Set集合的存储特点：
		 * 1、无序
		 * 2、去重
		 */
		Set<String> set1 = new HashSet<>();
		boolean b1 = set1.add("aaa");//true
		boolean b2 = set1.add("bbb");//true
		boolean b3 = set1.add("ccc");//true
		boolean b4 = set1.add("aaa");//false?.....
		System.out.println(set1.size());//3
		System.out.println(set1);//[aaa, ccc, bbb]
		System.out.println(b1+","+b2+","+b3+","+b4);
		
		boolean b5 = set1.add("ddd");//true
		boolean b6 = set1.add("ddd");//false
		boolean b7 = set1.add("eee");//true
		System.out.println(set1);
		System.out.println(b5+","+b6+","+b7);
		
		/*
		 * list集合的遍历：
		 * 	A：Iterator
		 * 	B：for-each
		 * 	C：普通for循环，结合get()
		 * 	D：ListIterator
		 * 
		 * set集合的遍历：
		 * 	A：Iterator
		 * 	B：for-each	
		 */
		
	}

}
