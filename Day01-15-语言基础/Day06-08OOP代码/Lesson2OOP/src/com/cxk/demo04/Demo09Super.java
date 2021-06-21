package com.cxk.demo04;
class A{
	int i = 100;//属性：成员变量

	public void fun(){
		System.out.println("A类的fun方法。。。");
	}
	
	public void testA(){
		System.out.println("A类的test方法。。" + i);
	}
}
class B extends A{
	int i = 200;
	
	public void testB(){
		//访问属性
		System.out.println("i--->" + this.i);//this这个当前对象，访问i变量，先在本类有没有这个属性。没有就找父类。
		System.out.println("i--->>"+super.i);//super访问属性，直接去父类中找。
		
		//访问方法
		this.fun();//this对象执行方法，先找本类找，如果没有，再找父类。
		super.fun();//super访问方法，直接找父类。
	}
	
	@Override
	public void fun() {
		System.out.println("B类重写了fun方法。。");
	}
}
public class Demo09Super {

	public static void main(String[] args) {
		A a = new A();
		a.testA();
		
		B b = new B();
		b.testB();
	}

}
