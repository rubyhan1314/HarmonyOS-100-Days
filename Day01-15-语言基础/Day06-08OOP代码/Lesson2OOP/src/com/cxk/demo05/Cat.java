package com.cxk.demo05;
/**
 * 3.子类2 Cat
 * @author hanru
 *
 */
class Cat extends Animal{
	//新增属性
	String color;
	//子类重写的
	@Override
	public void eat() {
		System.out.println("小猫吃小鱼干。。");
	}
	//子类新增的方法
	public void catchMouse(){
		System.out.println("小猫抓老鼠。。");
	}
}