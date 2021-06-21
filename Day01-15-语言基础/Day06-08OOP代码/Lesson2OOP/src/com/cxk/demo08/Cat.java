package com.cxk.demo08;
/**
 * 子类继承抽象父类，重写父类的抽象方法
 * @author hanru
 *
 */
public class Cat extends Animal{

	@Override
	public void move() {
		System.out.println("小猫跑啦。。");
	}

}
