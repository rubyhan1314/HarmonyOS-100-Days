package com.cxk.demo08;
//接口的目的：定义一套规则，标准。
interface F{
	//接口中，允许存在静态方法。语法级别上的。
	public static void fun(){
		System.out.println("接口中的静态方法。。");
	}
	
	/*
	 * 接口存在默认方法：
	 * default：
	 * 修饰的方法，默认方法，是拥有方法体。
	 * 	 1、jdk1.8才出现的新的特性。
	 * 	 2、接口可以提供关于功能的最基本的处理
	 * 	 3、不强制实现类去实现。
	 */
	default void test(){
		System.out.println("接口中的默认方法，");
	}
}

class FImpl implements F{
	
}
public class Demo27 {

	public static void main(String[] args) {
		F.fun();
		
		F f = new FImpl();
		f.test();
	}

}
