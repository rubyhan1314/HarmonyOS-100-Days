package com.cxk.demo01;

public class Demo04 {

	public static void main(String[] args) {
		//Number:Byte,Short,Integer,Long,Float,Double
		//缓存数据：256个对象，来包装对应的数值
		/*
		 * [-128,127]
		 * 包装类的对象：-128,127，包装类中已经创建好了现成的，用就完了
		 */
		
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2);//地址，true
		
		Integer i3 = 200;
		Integer i4 = 200;
		System.out.println(i3 == i4);//false
	}

}
