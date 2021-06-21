package com.cxk.demo01;
/**
 * 学生类
 * @author hanru
 *
 */
public class Student
{
	String name;
	int age;
	String hobby;

	public void introduce() {
		System.out.println("我是" + name + "，今年" +  age + "岁了。爱好：" + hobby);
	}

	public void dance() {
		System.out.println(name+",跳一段广场舞");
	}

	public void sing() {
		System.out.println(name+",来一段freeStyle");
	}

	public void lie() {
		System.out.println(name+",来讲个段子。。");
	}
}