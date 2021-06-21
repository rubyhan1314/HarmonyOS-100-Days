package com.cxk.demo02;

import java.util.ArrayList;
import java.util.List;

public class Demo08Generics {
	
	//集合作为参数：集合的泛型可以是任意类型
	public static void printList(List<?> list){
		for(Object obj:list){
			System.out.println("---->"+obj);
		}
		
	}
	//集合作为参数：集合泛型必须是Object，但是集合中可以存储任意类型的元素
	public static void printList2(List<Object> list){
		
	}
	/*
	 * ？ extends E,限定了上限
	 * 接收集合：泛型：E，以及E的子类
	 */
	public static void printList3(List<? extends Person> list){
		for(Person p:list){
			System.out.println(p);
		}
	}
	/*
	 * ？ super E,限定了下限
	 * 接收集合：泛型：E，以及E的爹们
	 * 
	 */
	public static void printList4(List<? super Student> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static void main(String[] args) {
		List<Person> l1 = new ArrayList<Person>();
		List<Student> l2 = new ArrayList<>();
		List<String> l3 = new ArrayList<>();
		List<Integer> l4 = new ArrayList<>();
		List<Object> l5 = new ArrayList<>();//Person,Student,String,Integer.....
		
		printList(l3);
		printList2(l5);
		
		printList3(l2);
		printList4(l5);
	}
}
