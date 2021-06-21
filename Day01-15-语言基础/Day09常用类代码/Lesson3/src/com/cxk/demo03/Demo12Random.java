package com.cxk.demo03;

import java.util.Random;
/**
 * 随机数
 * @author hanru
 *
 */
public class Demo12Random {

	public static void main(String[] args) {
		//step1:创建Random类的对象
		Random r1 = new Random();
		
		//step2：通过r1调用方法，就能够生成各种各样的随机数
		boolean b1 = r1.nextBoolean();//产生一个boolean类型的随机数
		System.out.println(b1);
		
		double d1 = r1.nextDouble();//产生一个随机double类型，取值范围：[0,1)
		System.out.println(d1);
		
		int i1 = r1.nextInt();//产生一个int类型的随机数
		System.out.println(i1);
		
		int i2 = r1.nextInt(3);//产生一个int类型的随机数：[0,3)
		System.out.println(i2);
		
		
		Random r2 = new Random(10);
		Random r3 = new Random(10);
		System.out.println("-->"+r2.nextInt());
		System.out.println("-->"+r3.nextInt());
	}

}
