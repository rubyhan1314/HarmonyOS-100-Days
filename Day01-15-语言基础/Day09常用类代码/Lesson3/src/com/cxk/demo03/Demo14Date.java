package com.cxk.demo03;

import java.util.Date;

public class Demo14Date {

	public static void main(String[] args) {
		//1.获取当前的时间
		Date date = new Date();//获取当前系统时间,Mon Apr 26 13:49:35 IRKT 2021
		System.out.println(date);//toString()已经重写
		
		//2.获取指定的时间
		Date date2 = new Date(800000000000L);//获取从标准基准时间起800000000000L毫秒的时间点,Tue May 09 15:13:20 IRKST 1995
		System.out.println(date2);
		
		//3.判断日期前后
		boolean boo1 = date.after(date2);//若date1在date2之后，则返回true，否则返回false
		boolean boo2 = date.before(date2);//若date1在date2之前，则返回true，否则返回false
		System.out.println(boo1);
		System.out.println(boo2);
		
		//4.比较两个日期
		int i = date.compareTo(date2);
		System.out.println(i);
		
		//5.获取时间
		long time = date.getTime();
		System.out.println(time);
		
		//6.修改时间
		date.setTime(900000000000L);
		System.out.println(date);
		
	}
}
