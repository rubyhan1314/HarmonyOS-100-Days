package com.cxk.demo05;
/**
 * 2.子类1，Dog
 * @author hanru
 *
 */
class Dog extends Animal{
	//子类的新增方法
	public void lookDoor(){
		System.out.println("小狗看家。。");
	}
	//子类重写的方法
	@Override
	public void eat() {
		System.out.println("小狗吃骨头。。。");
	}
}