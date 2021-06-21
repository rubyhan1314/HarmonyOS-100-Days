package com.cxk.demo06;

public class Demo13Object {

	public static void test1(Object obj){//Object类型，作为所有类的祖宗，实际上传入任意的子类对象都可以
		
	}
	
	public Object test2(){
		Object obj = new Object();
		Person p2 = new Person();
		return p2; //p2--->Object，
	}
	
	public static void main(String[] args) {
		Object obj = new Object();
		Person p1 = new Person();
		Student s1 = new Student();
		test1(obj);
		test1(p1);
		test1(s1);
		
		Class cls = obj.getClass();//通过反射获取到了Object类
		System.out.println(p1.getClass());//class com.cxk.demo06.Person
		System.out.println(s1.getClass());//class com.cxk.demo06.Student
		
	}

}
class Person extends Object{}

class Student extends Person{}
