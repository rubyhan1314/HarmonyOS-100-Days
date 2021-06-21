package com.cxk.demo03;

import java.math.BigDecimal;

public class Demo13BigDecimal {

	public static void main(String[] args) {
		//基本数据类型double的计算
		double d1 = 0.05;
		double d2 = 0.01;
		System.out.println(d1+d2);
		System.out.println(1.0-0.9);
		
		System.out.println(0.1+0.2);
		System.out.println(1.5+0.3);
		
		System.out.println("------------------");
		//1.构造方法
		//BigDecimal,构造BigDecimal对象时候，如果直接使用double类型作为参数，存在精度
		BigDecimal bd1 =new BigDecimal(0.05); //0.05000000000000000277555756156289135105907917022705078125
		BigDecimal bd2 = new BigDecimal(0.01); //0.01000000000000000020816681711721685132943093776702880859375
		System.out.println(bd1);//重写了toString(),显示存储的数值
		System.out.println(bd2);
		
		BigDecimal bd3 = new BigDecimal("0.05");
		BigDecimal bd4 = new BigDecimal("0.01");
		System.out.println(bd3);
		System.out.println(bd4);
		System.out.println("------------------");
		
		//2.加减乘除等
		
		//加法
		BigDecimal res1 = bd3.add(bd4);//d1+d2--->d1.add(d2)
		System.out.println(res1);
		

		//减法
		BigDecimal res2 = bd3.subtract(bd4);
		System.out.println(res2);
		//乘法
		BigDecimal res3 = bd3.multiply(bd4);
		System.out.println(res3);
		BigDecimal bd5 = new BigDecimal("10");
		BigDecimal bd6 = new BigDecimal("3");
		
		//除不尽的情况，必须明确2个信息：(小数点后保留几位，是否使用四舍五入)
//		BigDecimal res4 = bd5.divide(bd6);
		BigDecimal res5 = bd5.divide(bd6, 2, BigDecimal.ROUND_HALF_UP);
		System.out.println(res5);
		
	}

}
