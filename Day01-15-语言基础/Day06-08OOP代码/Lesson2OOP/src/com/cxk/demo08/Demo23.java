package com.cxk.demo08;
/**
 * 定义一种规则
 * @author hanru
 *
 */
interface A{
	public void testA();//
	public void fun();
}
/**
 * 定义另一种规则
 * @author hanru
 *
 */
interface B{
	public void testB();
	public void fun();
}
/**
 * 实现类，实现接口A。满足接口的规则：其实就是要实现接口中所有的抽象方法。
 * @author hanru
 *
 */
class DemoA implements A,B{
	@Override
	public void testA() {
		System.out.println("DemoA类，满足接口A的规则。。。");
	}
	
	@Override
	public void testB() {
		System.out.println("DemoA类，也满足接口B的规则。。。");
	}
	
	@Override
	public void fun() {
		System.out.println("DemoA类，实现类fun方法。。。");
	}
}

public class Demo23 {

	public static void main(String[] args) {
		A a = new DemoA();
		a.testA();
		a.fun();
		
		
		B b = new DemoA();
		b.testB();
		b.fun();
		
		DemoA demoA = new DemoA();
		demoA.testA();
		demoA.testB();
	}

}
