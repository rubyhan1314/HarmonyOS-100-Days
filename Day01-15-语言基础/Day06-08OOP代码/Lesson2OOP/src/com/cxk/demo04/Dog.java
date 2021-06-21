package com.cxk.demo04;
/**
 * 子类继承父类
 * @author hanru
 *
 */
public class Dog extends Animal {
	
	public Dog(){
		//super();//父类的无参的构造方法
	}
	
	public void lookHome(){
		System.out.println("小狗看家。。");
	}
}
