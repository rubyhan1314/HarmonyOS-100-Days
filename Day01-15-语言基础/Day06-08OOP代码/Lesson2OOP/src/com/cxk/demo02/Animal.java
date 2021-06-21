package com.cxk.demo02;

//1.先创建一个类Animal
public class Animal {
	// 2.添加一个有参构造
	public Animal(String str) {
		System.out.println("构造方法被调用，" + str);
	}

	// 3.添加无参的构造方法
	public Animal() {
		System.out.println("无参的构造方法被调用");
	}
}
