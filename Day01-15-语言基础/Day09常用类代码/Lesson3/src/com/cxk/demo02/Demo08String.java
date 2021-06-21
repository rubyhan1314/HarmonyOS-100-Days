package com.cxk.demo02;
class Demo08String 
{
	public static void main(String[] args) 
	{
		//s1表示引用，存储在栈空间中，但是，“hello”存储在常量池中
		String s1 = "hello";
		String s2 = "hello";
		//注意1：使用一个字符串常量定义两个不同的变量，这时两个变量其实在内存中是同一块内存空间
		//原因：两个变量都拷贝了字符串常量的地址
		System.out.println(s1 == s2);//true
		System.out.println(s1.equals(s2));//true

		//注意2：但凡遇到new关键字，表示开辟了不同的空间
		//s3和s4分别指向了两个不同的有效空间
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3 == s4);//false
		System.out.println(s3.equals(s4));//true

		System.out.println(s1 == s3);//false
		System.out.println(s1.equals(s3));//true

		/*
		String s1 = "hello";		只有一个对象，是“hello”
		String s3 = new String("hello");	两个对象，一个是“hello”,另外一个就是new出现的对象
		*/

		//字符串是一个特殊的对象，一旦被初始化之后将不能发生改变
		//注意3：不能发生改变指的是真正的对象【字符串常量对象和new出现的对象】
		s1 = "java";

		/*
		String str = "abc";
		等价于char[] arr = {'a','b','c'};

		a.字符串的底层是一个字符数组，默认的修饰符为final
		b.访问权限修饰符是private，私有的，没有提供对外的可以修改数组的方法，所以数组中的元素不能发生改变
		*/
	}
}