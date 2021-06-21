package com.cxk.demo02;

/**
 * String类
 * 
 * @author hanru
 *
 */
public class Demo05String {

	public static void main(String[] args) {
		// 1.字符串常量：双引号引起来的字符串的内容
		// 2.直接声明一个字符串：字符串池中。相同内容的字符串，就一份。共享。
		String s1 = "abc";// s1表示引用，存储在栈空间中，但是，“abc”存储在常量池中
		System.out.println(s1);

		String s2 = "abc";
		System.out.println(s2);
		// 注意1：使用一个字符串常量定义两个不同的变量，这时两个变量其实在内存中是同一块内存空
		System.out.println(s1 == s2); // true

		s2 = "memeda";

		String s3 = "abc";// 池中

		System.out.println("-----------------------------");
		// 通过new关键字，创建String对象。
		// 注意2：但凡遇到new关键字，表示开辟了不同的空间
		// s4和s5分别指向了两个不同的有效空间
		String s4 = new String("abc");// 因为有new，在堆中创建一个对象，保存在堆中

		String s5 = new String("abc");// 因为有new，重新创建对象，保存在堆中

		String s6 = new String("haha");// 因为有new，重新创建对象，

		// 地址的比较：==
		System.out.println(s1 == s3);// true
		System.out.println(s4 == s5);// false
		System.out.println(s1 == s4);// false

		// 比较内容：equals,String类重写了equals，专门比较内容
		System.out.println(s1.equals(s3));// true
		System.out.println(s4.equals(s5));// true
		System.out.println(s1.equals(s4));// true
		
		/*
		String str = "abc";
		等价于char[] arr = {'a','b','c'};

		a.字符串的底层是一个字符数组，默认的修饰符为final
		b.访问权限修饰符是private，私有的，没有提供对外的可以修改数组的方法，所以数组中的元素不能发生改变
		*/
	}
}
