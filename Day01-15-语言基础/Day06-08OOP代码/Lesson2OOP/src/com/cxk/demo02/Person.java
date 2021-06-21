package com.cxk.demo02;
/**
 * 
 * @author hanru
 *
 */
public class Person {
	String name;
	int age;
	String address;
	
	
	//无参构造
	public Person(){
		System.out.println("调用构造方法，创建对象。。");
	}
	//有参构造，将接收到的参数，赋值给字段属性
	public Person(String name,int age){
		this();
		this.name = name;
		this.age = age;
	}
	public Person(String name,int age,String address){
		this(name, age);
		this.address = address;
	}
	
	
	public void printMessage(){
		System.out.println("姓名："+this.name+",年龄："+this.age);
		if(!("".equals(this.address)||this.address == null)){
			this.testAddress();//this对象，调用本类的成员方法
		}
	}
	public void testAddress(){
		System.out.println("家庭住址是："+this.address);
	}
}
