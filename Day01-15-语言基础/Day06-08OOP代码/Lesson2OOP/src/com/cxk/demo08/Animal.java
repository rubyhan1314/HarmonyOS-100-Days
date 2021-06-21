package com.cxk.demo08;
/**
 * 动物类：
 * 	字段：性别，年龄
 * 	方法：eat()，move()，
 * @author hanru
 *
 */
public abstract class Animal {//表示该类是抽象的。
	private int age;
	private char sex;
	
	
	
	public void eat(){
		System.out.println("吃东西。。");
	}
	
	//动物应该有动的功能。。跑，飞，游。。
	public abstract void move();
	
	
		
	public Animal(int age, char sex) {
		this.age = age;
		this.sex = sex;
	}
	public Animal() {
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
	
}
