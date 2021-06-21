package com.cxk.demo02;

public class Demo05Person {

	public static void main(String[] args) {
		//1.=左边对象的声明，=右边对象的创建
		Person p1= new Person("王二狗",18,"上海市");
		p1.printMessage();
		//2.只有=右边对象的创建
		new Person();//匿名对象
		//再次创建一个匿名对象，调用方法
		new Person("ruby", 19, "北京市").printMessage();
		
	}

}
