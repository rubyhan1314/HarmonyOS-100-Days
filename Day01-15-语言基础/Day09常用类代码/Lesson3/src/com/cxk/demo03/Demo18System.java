package com.cxk.demo03;

import java.util.Arrays;

/**
 * System类
 * 
 * @author hanru
 *
 */
public class Demo18System {

	public static void test() {
		long sum = 0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
//		System.out.println(sum);
	}

	public static void main(String[] args) {
		/*
		 * 1. arraycopy()数组拷贝 
		 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		 * 第一个参数：Object src，原数组
		 * 第二个参数：int srcPos，从原数组的哪个下标开始拷贝 
		 * 第三个参数：Object dest，目标数组 
		 * 第四个参数：int destPos，向目标数组的哪个下标开始粘贴 
		 * 第五个参数：int length，拷贝元素的个数
		 * 
		 * 该方法的作用是数组拷贝，也就是将一个数组中的内容复制到另外一个数组中的指定位置，由于该方法是native方法，
		 * 所以性能上比使用循环高效。
		 */
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.arraycopy(arr1, 1, arr2, 2, 4);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		

		/*
		 * 2.获取当前时间
		 * public static long currentTimeMillis()
		 * 
		 * 该方法的作用是返回当前的计算机时间，时间的表达格式为当前计算机时间和GMT时间(格林威治时间)1970年1月1号0时0分0秒所差的毫秒数。
		 */
		long startTime = System.currentTimeMillis();//2021/4/26/15/38
		System.out.println(startTime);
		test();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println("求和共耗时：" + (endTime - startTime) + "ms");

		
		
		
		/*
		 * 3.gc()收垃圾
		 */
		
		System.gc();// 通知收垃圾
		
		
		/*
		 * 4.exit(),，退出
		 * System.exit(0);//终止JVM的执行。。
		 */
//		System.exit(0);//终止JVM的执行。
		System.out.println("helloworld");
		
		
		
		
		/*
		 * 5.getProperties()，获取属性信息
		 */
		System.getProperties().list(System.out);
		String property = System.getProperty("java.runtime.version");//获取java的版本
		System.out.println(property);

		
	}

}
