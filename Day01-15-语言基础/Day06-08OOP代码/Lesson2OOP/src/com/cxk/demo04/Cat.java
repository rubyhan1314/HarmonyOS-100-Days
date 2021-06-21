package com.cxk.demo04;

/**
 * 子类继承父类
 * @author hanru
 *
 */
public class Cat extends Animal{//name,age,color
	private String color;
	
	
	
	public Cat(){
		//子类的构造方法的第一行，默认会调用父类的构造方法：默认无参
		super();//表示父类的构造方法。此行代码，可以省略不写，编译器会自动添加的。
		System.out.println("Cat类的无参构造方法。。。");
	}
	
	
	public Cat(String name,int age,String color){
		//super();//编译器默认添加的都是无参的构造方法。。
		super(name, age);//父类的有参构造
		this.color = color;
		
		System.out.println("Cat类的有参构造方法。。");
	}
	

	public void catchMouse(){
		System.out.println("小猫抓老鼠。。");
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
}
