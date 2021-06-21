package com.cxk.demo07;


public class Person {//50人，49个男生，1个女生
	//成员变量：随着对象的创建而产生的。每个对象都有自己的一份属性值，和其他的对象的数值是无关的。
	String name;//属于对象？什么时候产生？
	int age;
	
//	String sex;//咱班巧了，都是男生。。
	static String city;//该类的对象，属性值，恰巧都相同。
	
	
	//打印对象的属性信息
	public void showInfo(){
		System.out.println("姓名："+this.name+",年龄："+age+",城市："+city);
	}

	//1.测试静态的成员方法
	public static void test1(){//属于类
		//1.在静态方法中，不能访问非静态的属性：因为non-static的属性，属于对象的，此时可能没有对象。
//		System.out.println("name:"+name);//Cannot make a static reference to the non-static field name
//		System.out.println("age:"+age);
		//2.在静态方法中，可以直接访问静态的属性：因为都属于类，随着类的加载而产生。
		System.out.println("city:"+Person.city);
		
		//3.在静态方法中，访问其他的静态方法：因为都属于类，
		Person.test2();//可以省略类名
		
		//4.在静态方法中，不可以访问非静态的方法：因为non-static的方法，属于对象的，由对象调用。
		//test3();//Cannot make a static reference to the non-static method test3() from the type Person
		
		//5.this和super这两个关键字，语法层面上，不能出现在static方法中。
		
	}
	
	public static void test2(){//静态方法，属于类的，类调用
		System.out.println("静态的方法test2()。。");
		Person p1 = new Person();
		System.out.println(p1.name);//?
		System.out.println(p1.age);//?
//		p1.test3();
	}
	
	
	
	public void test3(){//非静态方法，属于对象的，对象调用
		System.out.println("非静态的方法。。test3()");
		//1.非静态方法属于对象的，可以直接访问非静态属性，因为也是属于对象。
		System.out.println("name:"+this.name);//可以访问非静态的属性，
		System.out.println("age:"+this.age);//
		
		//2.非静态方法，可以调用静态的属性，属于类的。
		System.out.println("city:"+Person.city);//
		
		//3.非静态方法，可以直接访问其他的非静态方法吗？可以的。都是对象的。
		this.showInfo();
		
		//4.非静态方法，可以直接访问静态的方法吗？可以的。
		test2();//?
		
	}
}
