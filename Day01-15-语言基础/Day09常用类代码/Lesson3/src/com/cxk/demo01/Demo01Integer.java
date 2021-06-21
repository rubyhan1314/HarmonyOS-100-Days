package com.cxk.demo01;


public class Demo01Integer {

	public static void main(String[] args) {
		//静态的属性：
		System.out.println("获取最大值："+Integer.MAX_VALUE);
		System.out.println("获取最小值："+Integer.MIN_VALUE);
		//byte的最大值和最小值
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		//1.创建包装类的对象：
		int i = 100;//基本类型
//		创建一个包装类的对象，包装的是int类型的i
		Integer i2obj = new Integer(i);//将基本类型int，构建一个Integer对象
		Integer i3obj = new Integer("200");//基于String类型，构建一个Integer对象
		
		//2.类的对象有方法
		//A：Integer类，重写了Object中的toString()方法。不显示地址，显示数值本身。String类型
		System.out.println(i2obj.toString());//"100"
		System.out.println(i3obj.toString());//"200"
		
		//B：将对象，转为基本类型：6种类型 Number父类中提供的
		byte b1 = i2obj.byteValue();//将i2obj这个对象，转为byte类型的数据
		short s1 = i2obj.shortValue();
		int i2 =i2obj.intValue();
		long l1 = i2obj.longValue();
		float f1 = i2obj.floatValue();
		double d1 = i2obj.doubleValue();
		
		//C：通过静态的方法parseXXX(),将一个String类型，解析为基本类型的数据
		int i3 = Integer.parseInt("123");//猜：长的像数值才可以。"兼容类型"
		byte b3 = Byte.parseByte("99");
		float f3 = Float.parseFloat("1.23");
		System.out.println(i3);
		System.out.println(b3);
		System.out.println(f3);
		//不是每个String都能转成数值，不兼容的不行
//		int i4 = Integer.parseInt("memeda");//java.lang.NumberFormatException: For input string: "memeda"
		
		
		//D：通过valueOf(基本类型/String)-->获取一个包装类的对象类型
		Integer i4obj = Integer.valueOf(100);
		Integer i5obj = Integer.valueOf("105");//猜：长的像数值才可以。"兼容类型"
		System.out.println(i5obj);//?

		

		
		
	}

}
