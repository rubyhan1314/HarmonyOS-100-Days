package com.cxk.demo06;

public class Demo15toString {

	public static void main(String[] args) {
		Worker w1 = new Worker();
		w1.name = "王二狗";
		w1.age = 30;
		w1.sex = "男";
		w1.salary = 35000.00;
		//此处隐含着，自动调用对象toString()
		System.out.println(w1);//对象的地址：逻辑地址 ，0x1314
		
		//查看对象--->查看对象的属性
		System.out.println(w1.name +","+w1.age+","+w1.sex+","+w1.salary);
		
		Worker w2 = new Worker();
		w2.name ="李小花";
		w2.age = 25;
		w2.sex = "女";
		w2.salary = 15000.00;
		
		//此处隐含着，自动调用对象toString()
		System.out.println(w2);//对象的地址，逻辑地址：0x7788
		w2.showInfo();
		//打印字符串：调用对象的toString()，可以获取一个String字符串，目的：是为了对象进行描述。希望通过对象的属性值来介绍对象。
		System.out.println(w1.toString());//对w1进行文本描述
		System.out.println(w2.toString());//对w2进行文本描述，com.qf.demo01.Worker@6d06d69c
//		System.out.println("w2的哈希值："+w2.hashCode());
//		System.out.println("w2的哈希值：16进制："+Integer.toHexString(w2.hashCode()));
	}
}
//类：对同一类事物的抽象描述：属性和方法
class Worker{
	String name;
	int age;
	String sex;
	double salary;
	
	
	//我们自己写的
	public void showInfo(){//?该方法，用于显示对象的各个属性信息----->看看对象
		System.out.println(name+","+age+","+sex+","+salary);
	}

	//shift+alt+s-->generate toString()
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", sex=" + sex + ", salary=" + salary + "]";
	}
	
	//提供一个方法，返回值：String，用于描述一个对象的。用于显示对象的信息
//	@Override
//	public String toString() {
//		return "姓名："+name+",年龄："+age+",性别："+sex+",工资："+salary;
//	}
	
	
	
	
}
