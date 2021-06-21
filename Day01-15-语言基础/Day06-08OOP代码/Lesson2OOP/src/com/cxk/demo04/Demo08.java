package com.cxk.demo04;

/**
 * 父类：Animal
 * 	属性：name，age
 * 	方法：eat()，sleep()
 * 
 * 子类：Cat
 * 	新增属性：color
 * 	新增方法：catchMouse()
 * 
 * 子类：Dog
 * 	新增方法：lookHome()
 * @author hanru
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		//1.创建父类的对象：可以访问父类的属性和方法。
		Animal a1 = new Animal("",1);
		
		System.out.println(a1.getName());
		System.out.println(a1.getAge());
		a1.eat();
		a1.sleep();
		
		//2.创建子类对象：
		Cat c1 = new Cat();
		c1.setName("小花");//访问父类的属性
		c1.setAge(2);
		c1.setColor("黑白");//访问子类的属性
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getColor());
		
		c1.eat();//访问父类的方法
		c1.sleep();//访问父类的方法
		c1.catchMouse();//子类新增的方法
		System.out.println("---------------------");
		Cat c2 = new Cat("嘟嘟", 3, "橘色");
		System.out.println(c2.getName());
		System.out.println(c2.getAge());
		System.out.println(c2.getColor());
		
		System.out.println("---------------------");
		Dog d1 = new Dog();
		d1.setName("啸天");
		d1.setAge(4);
		d1.eat();
		d1.sleep();
	}

}
