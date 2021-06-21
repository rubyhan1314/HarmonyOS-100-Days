package com.cxk.demo04;


public class Demo07Person {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "王二狗";//子类的对象，可以直接访问父类的属性
		s1.age = 19; //同上
		
		s1.school = "清华大学";//子类的对象，访问自己的属性
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.school);
		
		
		s1.sleep();//子类的对象，可以访问父类的方法
		s1.study();//子类的对象，访问子类的方法。
		
		s1.eat();//默认调用子类重写后的方法。
		
		Person p1 = new Person();//父类的对象，不能访问子类的内容：属性，方法。
		p1.name ="王爸爸";//父类的属性
		p1.age = 40;//父类的方法
		
		p1.eat();//父类的方法
		//p1.study();//父类不能访问子类的内容：属性，方法：新增和重写。
		
	}

}
