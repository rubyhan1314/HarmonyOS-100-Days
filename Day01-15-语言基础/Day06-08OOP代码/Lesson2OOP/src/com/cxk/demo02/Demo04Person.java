package com.cxk.demo02;

public class Demo04Person {

	public static void main(String[] args) {
		//无参构造
		Person p1 = new Person();
		//对象访问字段属性赋值
		p1.name = "王二狗";
		p1.age = 18;
		p1.address = "北京市XXX路XXX胡同";
		//对象访问字段属性取值打印
		System.out.println(p1.name +","+p1.age+","+p1.address);
		
		//有参构造，创建对象，并且为属性赋值
		Person p2 = new Person("程序咖", 1, "北京市XXX");
		System.out.println(p2.name +","+p2.age+","+p2.address);
		
		p2.printMessage();
		Person p3 = new Person("ruby", 18, "");
		p3.printMessage();
		
	}

}
