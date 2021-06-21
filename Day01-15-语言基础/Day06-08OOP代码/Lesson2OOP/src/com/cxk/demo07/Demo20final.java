package com.cxk.demo07;

final class A{//不能有子类来继承的，代表最后一个类了。
	//The blank final field country may not have been initialized
	//当前final修饰的成员变量，没有被初始化。
	final String country = "程序咖";//成员变量
	
	
	public final void testA(){//最后的方法：这是最终模式，要求子类不能重写
		System.out.println("A类的成员方法。。。");
	}
	
	
}
//The type B cannot subclass the final class A
//B类不能继承final修饰的A类。
//class B extends A{
	//Cannot override the final method from A
	//不允许子类重写父类的final方法
//	@Override
//	public void testA() {//子类重写父类的方法
//		System.out.println("B类重写A类的方法。。");
//	}
//}


public class Demo20final {

	public static void main(String[] args) {
		final int a = 10;//普通的局部变量
		System.out.println(a);
		/*
		 * The final local variable a cannot be assigned. It must be blank and not using a compound assignment
		 * final修饰的局部变量，不能被重新赋值
		 * 
		 * final修饰的变量：局部，还是成员的，一旦被赋值，之后不能修改数据的。
		 */
//		a = 20;//重新赋值，更改变量的值。，报错，不允许修改final修饰的局部变量
		System.out.println(a);
		
		A a2 = new A();
		System.out.println(a2.country);
//		a2.country = "其他国家";//报错，不允许修改final修饰的成员变量
		a2.testA();
		
//		B b = new B();
//		b.testA();
	}

}
