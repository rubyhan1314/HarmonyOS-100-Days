package com.cxk.demo02;

public class Demo06CreateString {

	public static void main(String[] args) {
		//1.null和""的区别：

		String s1 = new String();//字符串对象存在，只是存储的字符没有，内容是空的。
		System.out.println(s1);
		
		String s3 = "";//""
		System.out.println(s3);//""
		
		
		String s2 = null;//字符串对象不存在，直接访问属性或方法，会空指针异常。
		System.out.println(s2);
		
		System.out.println(s1.length());//该字符串的长度
//		System.out.println(s2.length());//java.lang.NullPointerException
		
		
		//2.使用字节数组构建一个字符串，IO流
		/*
		 * String(byte[] bytes, int offset, int length) 
			通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String 
			
			第一个参数：byte[] bytes,数据源
			第二个参数：int offset，偏移量，从哪个下标开始的数据，构建字符串
			第三个参数：int length，长度，获取的个数。
		 */
		byte[] b1 = {65,66,67,68,69};//ABCDE
		String s4 = new String(b1);//使用b1这个数组中的数据，构建一个字符串
		System.out.println(s4);
		
		String s5 = new String(b1, 2, 3);
		System.out.println(s5);
		
		//3.通过字符数组，构建一个字符串
		char[] c1 = {'a','b','c','d','e','f'};
		String s6 = new String(c1);
		System.out.println(s6);
		
		String s7 = new String(c1, 1, 3);
		System.out.println(s7);
		
		
	}

} 
