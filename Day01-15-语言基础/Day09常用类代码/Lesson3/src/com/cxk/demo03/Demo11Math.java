package com.cxk.demo03;
/**
 * Math类，都是数学相关的静态方法。可以通过类名直接访问。
 * @author hanru
 *
 */
public class Demo11Math {

	public static void main(String[] args) {
		
		
		System.out.println(Math.random());//随机数，取值范围：[0,1)，随机小数
		//偷偷的看了一下Math.random()的源代码，发现就是new Random对象，调用nextDouble()方法。
		/*
		 * 需求：int
		 * 
		 * 
		 * [0,1)  * 100
		 * --->[0,100) [0,99.999999999]
		 * 直接取整数部分：(int)-->[0,99]
		 * 
		 * 
		 * 取[0,100]的随机数
		 * -->取[0,100.9889988)
		 * -->[0,1)*101-->[0,101)
		 * 			100.99999999999
		 * -->(int)-->[0,100]
		 * 
		 * 
		 * 取[0,10]的随机数
		 * -->取[0,10.999999]
		 * -->[0,1)*11    -->[0,11)
		 * 						10.9999999
		 * -->(int)-->[0,10]
		 * 
		 * 取[5,15]的随机数
		 * --->[0,10]+5--->[5,15]
		 * --->[0,1)*11--->[0,11)
		 * 					10.9999999
		 * --->(int)--->[0,10]
		 * 
		 * 取[3,14]的随机数
		 * --->[0,11]+3
		 * --->[0,1)*12 --->[0,12)
		 * 						11.999999
		 * --->(int)-->[0,11]
		 * 
		 * 取[m,n]之间的随机整数
		 * -->[0,n-m] + m
		 * 
		 * (int)(Math.random()*(n-m+1)+m);//获取[m,n]之间的随机整数的公式
		 */
		
		double d1 = Math.random();//[0,1)
		double d2 = d1 * 100;//乘以100后的取值范围？[0,100)
		
		int i1 = (int)d2;//[0,99]
		
		int i2 = i1 + 3;//[3,102]
		System.out.println((int)(Math.random()*100+3));
		
		System.out.println((int)(Math.random()*101));//[0,100]
		System.out.println((int)(Math.random()*11));//[0,10]
		System.out.println((int)(Math.random()*11+5));//[5,15]
		System.out.println((int)(Math.random()*12+3));//[3,14]
		
		
		
	}
}
