package com.cxk.demo01;


public class Demo02Person {

	public static void main(String[] args) {
		// 1.创建一个Person类的对象
		Person p1 = new Person();
		System.out.println(p1);// p1的内存地址：com.qf.demo01.Person@15db9742

		p1.name = "张三狗";
		p1.age = 19;
		p1.sex = '男';

		System.out.println(p1.name);// 张三狗
		System.out.println(p1.age);// 19
		System.out.println(p1.sex);// 男

		// 2.再创建一个Person类的对象

		Person p2 = new Person();
		System.out.println(p2);// p2的内存地址，com.qf.demo01.Person@6d06d69c

		p2.name = "李小花";
		p2.age = 17;
		p2.sex = '女';

		System.out.println(p2.name);// 李小花
		System.out.println(p2.age);// 17
		System.out.println(p2.sex);// 女

		// 3.
		Person p3 = null;// 仅仅声明了Person类型的对象p3，但是实际上，并没有在堆内存中，创建出真正的对象。

		/*
		 * NullPointerException，空指针异常
		 * 
		 * 对象不存在，就是个null， 强行的访问对象的属性或调用方法，就会空指针异常。
		 */
		// System.out.println("---->"+p3.name);//报错啦：NullPointerException

		p3 = p1;// 将p1的值（p1对象的内存地址），赋值给p3，结果-->p1和p3存储的是同一个对象的内存地址。

		p3.name = "李铁柱";
		System.out.println(p1.name);// 李铁柱
		System.out.println(p2.name);// 李小花
		System.out.println(p3.name);// 李铁柱

		Person p4 = new Person();
		System.out.println(p4);// ?

		p4.name = "王二丫";
		p4.age = 18;
		p4.sex = '女';
		System.out.println(p4.name);
		System.out.println(p4.age);
		System.out.println(p4.sex);

		p4 = p1;// 改变对象的内存地址了，就不再指向原来的内存对象。
		System.out.println(p1.name);
		System.out.println(p3.name);
		System.out.println(p4.name);
	}

}
