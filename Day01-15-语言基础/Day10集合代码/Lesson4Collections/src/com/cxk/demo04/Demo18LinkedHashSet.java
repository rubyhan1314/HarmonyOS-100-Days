package com.cxk.demo04;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet集合
 * @author hanru
 *
 */
public class Demo18LinkedHashSet {

	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		set1.add("程序咖");
		set1.add("Ruby");
		set1.add("Ruby");
		set1.add("王二狗");
		set1.add("Rose");
		for(String s:set1){
			System.out.println(s);
		}
		System.out.println("---------------------");
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("程序咖");
		set2.add("Ruby");
		set2.add("Ruby");
		set2.add("王二狗");
		set2.add("Rose");
		for(String s:set2){
			System.out.println(s);
		}
	}

}
