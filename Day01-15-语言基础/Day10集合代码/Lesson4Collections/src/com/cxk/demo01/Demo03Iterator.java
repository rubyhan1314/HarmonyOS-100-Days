package com.cxk.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo03Iterator {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("aaa");
		c1.add("bbb");
		c1.add("ccc");
		
		//问题：如何获取集合中的元素？
		//方法一：for-each：增强for循环
		/*
		 * 语法原理：
		 * for(数据类型 变量名 : 数组/集合){
		 * 	打印变量名即可。
		 * }
		 */
		for(Object s:c1){//因为我们还没有引入泛型，所以存入集合中的元素类型都是Object类型
			System.out.println(s);
			//aaa
			//bbb
			//ccc
		}
		
		//方法二：Iterator，迭代器，依次获取集合中的元素。。
		/*
		 * Iterator接口：
		 * 	hasNext()-->boolean，判断是否有下一个元素
		 * 	next()-->元素，获取元素
		 */
		//step1：从该集合上获取迭代器对象--->it，接口类型的
		//接口类型 =  对象
		// 接口  		  接口引用   = new 实现类对象();
		//Collection c1     = new ArrayList();
		Iterator it = c1.iterator();//c1.iterator()，该方法，专门获取c1集合上的迭代器对象
		//接口类型  = 调用方法();
		
		//安装jdk1.8--->String，Object，Arrays,语法。。。Math,Random....
		//Collection接口,..add(),remove();iterator()...
		//ArrayList实现类，LinkedList，hashSet...
		
		//step2：
		//判断迭代器对象，是否有下一个元素
//		boolean b1= it.hasNext();
//		System.out.println(b1); //true
//		//A：获取迭代器后的对象，B：迭代器向后移动一下
//		String s1 = it.next();
//		System.out.println(s1);//aaa
//		
//		
//		boolean b2 = it.hasNext();
//		System.out.println(b2);//true
//		String s2 = it.next();
//		System.out.println(s2);//bbb
//		
//		boolean b3 = it.hasNext();
//		System.out.println(b3);//true
//		
//		String s3 = it.next();
//		System.out.println(s3); //ccc
//		
//		boolean b4 = it.hasNext();
//		System.out.println(b4);//false
//		
//		String s4 = it.next(); //java.util.NoSuchElementException
//		System.out.println(s4);
		
		while(it.hasNext()){//判断it后是否有下一个元素
			Object s = it.next();//获取it后的这个元素，并向后移动一下。
			System.out.println("--->"+s);
		}
		
		
		
		
		
	}
}
