package com.cxk.demo04;

/**
 * 父类：Animal
 * name，age
 * eat(),sleep()
 * @author hanru
 *
 */
public class Animal {
	private String name; 
	private int age;
	
	
	//有参构造方法
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("父类Animal的有参构造方法。。");
	}
	
	public Animal(){
		System.out.println("父类Animal的无参构造方法。。。");
	}
	
	
	
	public void eat(){
		System.out.println("吃东西啦。。。");
	}
	public void sleep(){
		System.out.println("睡着啦。。");
	}
	
	
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
}
