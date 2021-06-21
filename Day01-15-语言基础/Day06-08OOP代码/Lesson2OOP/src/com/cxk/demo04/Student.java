package com.cxk.demo04;
/**
 * 学生类
 * @author hanru
 *
 */
public class Student extends Person{ //描述学生， 学生也是人，只不过是个特殊的人群

	String school;//子类的新增的属性
	public Student() {
		super();//子类构造方法的第一行
		System.out.println("Student类的构造方法。。");
	}
	public Student(String name,int age,String school){
		super(name, age);
		this.school = school;
		System.out.println("Student类的有参构造。。");
	}
	
	public void study(){//子类的新增的方法
		System.out.println("学习啦。。可把爸爸乐坏了。。。");
	}
	
	//注解：标记，解释，说明
	@Override
	public void eat(){//子类将父类已有的方法，重新实现。方法的重写：override
		System.out.println("子类，吃炸鸡，喝啤酒。。");
	}
	
}