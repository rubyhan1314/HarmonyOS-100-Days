package com.cxk.demo07;

public class Demo19Static {
	
	String name ;//= "无名";//设置默认值
	int age ;//= 18;
	static String city ;//= "北京";
	
	{
		name="无名";
		age = 18;
		System.out.println("3...构造代码块。。。");
	}
	
	static{
		city = "北京";class Person{
			String name;
			int age;
			char sex;
			
		}
		System.out.println("1....静态代码块。。。");
	}
	
	public Demo19Static(){
		System.out.println("4...构造函数。。");
	}

	public static void main(String[] args) {
		{
			System.out.println("2....普通代码块，就是一块代码");
			int i = 10;
			System.out.println(i);
			if(i<0){
				System.out.println(i);
			}
		}
		
//		System.out.println(i);//没有被声明
		
		Demo19Static d1 = new Demo19Static();//name,age
		Demo19Static d2 = new Demo19Static();//name,age
		System.out.println(d1.name+","+d1.age);
		System.out.println(d2.name+","+d2.age);
		System.out.println(Demo19Static.city);
	}

}
