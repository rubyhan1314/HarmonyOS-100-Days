package com.cxk.demo04;

/**
 * Person类
 * @author hanru
 *
 */
public class Person {//描述 人类
	String name;
	int age;
	public Person() {
		System.out.println("Person类的构造方法。。");
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("Person类的有参构造。。");
	}
	public void eat(){
		System.out.println("吃窝窝头。。");
	}
	
	public void sleep(){
		System.out.println("睡觉啦。。");
	}
}
