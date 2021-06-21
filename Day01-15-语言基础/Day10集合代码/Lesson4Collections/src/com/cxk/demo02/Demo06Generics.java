package com.cxk.demo02;
/**
 * 泛型方法
 * @author hanru
 *
 */
public class Demo06Generics {
	/*
	 * 静态方法中不能使用类上的泛型，因为类的泛型属于对象，没有对象无法确定类型。
	 * 
	 * 静态方法中使用泛型，需要独立声明。使用<>,写在static之后，返回值类型之前
	 */
	public static <M> M test(M m){//静态方法如果要使用泛型，不能使用类的。需要自己独立声明
		System.out.println("测试静态方法中的泛型--->"+m);
		return m;
	}
	public static void main(String[] args) {
		String msg = test("程序咖");
		System.out.println(msg);
	}

}
