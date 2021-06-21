package com.cxk.demo03;

public class Demo06Person {

	public static void main(String[] args) {
		//1.创建对象
		Person p1 = new Person();
		//2.通过set方法设置各个字段的值
		p1.setName("王二狗");
		p1.setAge(18);
		p1.setSex('女');
		p1.setMarried(true);
		//3.通过get方法来获取字段的值
		System.out.println("姓名："+p1.getName()+",年龄："+p1.getAge()+",性别："+p1.getSex()+",是否已婚："+p1.isMarried());
		
		
	}
}
