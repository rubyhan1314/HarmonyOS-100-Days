package com.cxk.demo01;

//演示对象的创建，跨类进行调用成员方法以及访问成员变量
//测试类：含有main函数得类被称为测试类
public class Demo01Person {

	public static void main(String[] args) {
		//1.创建一个Person类的对象
		Person p1 = new Person();
		
		//2.对象访问属性，可以进行赋值，也可以获取值
		p1.name = "Ruby";
		p1.age = 19;
		p1.sex = '女';

		System.out.println(p1.name);// 张三狗
		System.out.println(p1.age);// 19
		System.out.println(p1.sex);// 男
		
		//3.对象访问方法，通过对象进行方法调用
		p1.eat();
		p1.sleep();
		p1.daDouDou();
	}

}
