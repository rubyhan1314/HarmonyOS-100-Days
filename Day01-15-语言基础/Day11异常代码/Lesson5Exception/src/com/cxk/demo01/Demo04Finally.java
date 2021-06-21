package com.cxk.demo01;

import java.util.Arrays;

/*
 * 1.try和catch中有return语句，finally里面的代码也会被执行。。
 * 
 * 2.应该避免finally中出现return语句：Eclipse会给出警告："finally block does not complete normally"
 * 		finally中return语句，会覆盖前面的return语句。
 * 
 * 		return的作用？
 * 			A：返回一个结果，
 * 			B：结束这个方法。
 * 		finally的作用？
 * 			首尾工作：可能产生异常catch，也可能不产生异常try，有些必须要执行的代码--->finally
 * 				断开连接，释放资源，删除临时文件。。。。
 * 3.finally中尝试修改变量
 * 		验证出：finally语句在return语句执行之后，return返回结果之前执行。
 */
public class Demo04Finally {

	public static int test1() {
		int i = 10;
		try {
			int j = i / 0;// 产生异常。。
			System.out.println("try...");
			return 0;// 1.返回一个结果，2.同时结束了该方法的执行。。
		} catch (Exception e) {
			System.out.println("catch..");
			return 1;
		} finally {
			// 无论是否产生异常：try，，catch，，此处的代码一定会被执行。。
			System.out.println("finally");//这条语句在方法返回1之后执行（最后执行的代码）
          	//return 2;//若打开此语句注释，则这个方法的返回值一定是2。但逻辑有误
		}

	}

	// 该方法返回一个引用类型的数据：数组，对象，StringBuffer。。。。
	public static int[] test3() {
		int[] arr = { 1, 2, 3 };
		try {
			// int i = 10/0;
			System.out.println("try...");
			return arr;//引用类型：地址
		} catch (Exception e) {
			System.out.println("catch...");
			return null;
		} finally {
			System.out.println("finally...");
			arr[0] = 100;// 在finally中修改引用类型的数据。。
		}
	}

	private static int doSome() {
		int i = 100;
		try {
			return i;//基本类型：数值
		} finally {
			System.out.println("....");
			i = 30;
//			++i;
//			i++;
		}
	
	}

	public static int test2() {
		int j = 5;
		if (j > 0) {
			return 0;
		}
		return 100;
	}

	public static void main(String[] args) {
		// System.out.println(test1());
		System.out.println(Arrays.toString(test3()));
		
		System.out.println(doSome());
	}

}

