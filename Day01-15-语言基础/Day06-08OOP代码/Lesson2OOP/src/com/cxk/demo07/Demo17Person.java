package com.cxk.demo07;

public class Demo17Person {

	public static void main(String[] args) {
		//创建对象
		Person p1 = new Person();
		p1.name = "王二狗";
		p1.age = 18;
		Person.city = "北京";//The static field Person.city should be accessed in a static way
		p1.showInfo();
		
		Person p2 = new Person();
		p2.name = "李小花";
		p2.age = 17;
		p2.city = "北京";
		p2.showInfo();
		
		//...以上已经创建了50个对象，都来自北京。。。
		p1.city = "上海";
		p1.showInfo();
		p2.showInfo();//?
	}

}
