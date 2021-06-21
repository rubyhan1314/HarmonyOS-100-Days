package com.cxk.demo08;

public class Demo21Abstract {

	public static void main(String[] args) {
		//抽象类，不能创建对象
//		Animal a1= new Animal();
//		a1.move();
		
		//创建子类对象
		Cat c1 = new Cat();
		c1.setSex('母');
		c1.setAge(2);
		c1.eat();//父类的方法
		c1.move();//子类重写来的方法
		
		//抽象类不能创建对象
//		Dog dog = new Dog();
		
		SmallDog d1 = new SmallDog();
		d1.eat();
		d1.move();
		
		BigDog d2 = new BigDog();
		d2.eat();
		d2.move();
	}

}
