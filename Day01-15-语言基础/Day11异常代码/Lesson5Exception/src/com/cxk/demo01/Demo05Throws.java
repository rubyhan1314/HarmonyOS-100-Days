package com.cxk.demo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo05Throws {
	// 该方法用于求2个数商
	/*
	 * throws关键字，表示该方法对外声明，表示该方法不处理异常，调用处处理。
	 */
	public static void test1() throws ArithmeticException {//运行时异常
		int i = 10;
		int j = 0;
		int div = i / j;
		System.out.println(div);

	}
	
	public static void test2() throws FileNotFoundException {//受检异常：必须处理
		File file = new File("D:\\Ruby\\pro\\chutian.jpeg");
		FileInputStream fis = new FileInputStream(file);
	}

	
	public static void test3(){
		try {
			test2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}//方法调用处
	}
	
	public static void main(String[] args) {//JVM

		test1();

		
		test3();
		System.out.println("程序咖");

	}
}

