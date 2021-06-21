package com.cxk.demo01;

import java.util.ArrayList;
import java.util.Collection;


public class Demo02Collections {

	public static void main(String[] args) {
		//创建一个集合，存储3个人，2个字符串，3个整数-->装箱
		Person p1 = new Person("王二狗", 18);
		Person p2 = new Person("李小花", 17);
		Person p3 = new Person("李铁柱", 19);
		
		Collection c3 = new ArrayList();//c3能够存储什么类型的数据？Object类型，任意对象
		//存储都是对象的地址。
		c3.add(p1);
		c3.add(p2);
		c3.add(p3);
		//重写toString()，就是为了打印好看：显示属性值，如果不重写，就显示地址
		System.out.println(c3);//
		c3.add("abc");
		c3.add("hello");
		c3.add(1);//int-->Integer-->Object
		c3.add(2);
		c3.add(3);
		System.out.println(c3);
		System.out.println(c3.size());//8个数组：3个Person，2个String，3个Integer
		
		//能否将集合中的Integer的数据，累加求和
		int sum = 0;
		for(Object obj:c3){//遍历该容器，获取里面的每一个元素obj
			if(obj instanceof Integer){//判断obj是否是Integer类型
				int i = (int) obj;//向下转型
				sum += i;//累加求和
			}
		}
		System.out.println(sum);//6
		
		//[Person [name=王二狗, age=18], Person [name=李小花, age=17], Person [name=李铁柱, age=19], abc, hello, 1, 2, 3]
		/*
		 * 这里的contains()方法在判断容器中是否包含指定的对象的时候，
		 * 需要将对象进行比较，所以对于Person类，
		 * 我们要重写它的equals()方法。
		 */
		System.out.println(c3.contains("hello"));//true
		System.out.println(c3.contains(3));//true
		System.out.println(c3.contains(new Person("王二狗", 18)));//false,true
		
		System.out.println(c3.remove("abc")); //false
		System.out.println(c3);
		
//		System.out.println(c3.remove(p1));
		
		
		//equals()
		/*
		 * 	String类，Integer类。。。都重写了equals(),toString()....
		 * 	String类，重写equals，比较是字符串的字面值""引起来的内容一样，就返回true。
		 * 	Integer类，重写equals，比较包装的数值。
		 * 	Person，--->Object,比地址
		 */
	}

}
