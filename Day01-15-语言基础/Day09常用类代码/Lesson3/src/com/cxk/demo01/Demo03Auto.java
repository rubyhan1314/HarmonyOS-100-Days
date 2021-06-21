package com.cxk.demo01;

import java.util.Arrays;

public class Demo03Auto {

	public static void main(String[] args) {
		int i = 10;
		
		
		Integer i2obj = new Integer(i);
		Integer i3obj = Integer.valueOf(i);
		
		//jdk1.5之后，自动装箱和拆箱
		
		Integer i4obj = 10;//自动装箱，将基本类型，直接赋值给包装类的对象。

		int j = i4obj;//自动拆箱，将包装类的对象的值，直接赋值给一个基本数据类型。
		
		//数组，存储8个基本类型的数据。？
		//数据类型统一：
		byte b1 = 10;
		short s1 = 20;
		int i1 = 30;
		long l1 = 40L;
		float f1 = 1.23f;
		double d1 = 2.34;
		char c1 = 'a';
		boolean bb1 = true;
		
		
		Object[] arr = new Object[8];//?存储神马的数据
		System.out.println(Arrays.toString(arr));
		arr[0] = b1;//byte-->Byte(自动装箱)-->Object类(向上转型)
		arr[1] = s1;//short-->Short(自动装箱)-->Object类(向上转型)
		arr[2] = i1;//int --> Integer --> Object
		arr[3] = f1;
		arr[4] = d1;
		arr[5] = c1;
		arr[6] = bb1;
		arr[7] = l1;
		
		for(Object obj:arr){
			System.out.println(obj.toString());
		}
		
		System.out.println("-----------");
		int i2 = (int)arr[2];//Object-->Integer -->int
		System.out.println(i2);
		int i3 = (Integer) arr[2];//Object -->Integer
		System.out.println(i3);
		
		
		
	}

}
