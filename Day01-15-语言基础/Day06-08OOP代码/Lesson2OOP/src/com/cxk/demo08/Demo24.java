package com.cxk.demo08;
/**
 * 
 * @author hanru
 *
 */
interface C{
	public void testC();//
	public void fun();
}
/**
 * 
 * @author hanru
 *
 */
interface D{
	public void testD();
	public void fun();
}
//实现类，实现接口A。满足接口的规则：其实就是要实现接口中所有的抽象方法。
interface E extends C,D{
	
}
class DemoE implements E{
	@Override
	public void testC() {
		System.out.println("DemoE类，满足接口C的规则。。。");
	}
	
	@Override
	public void testD() {
		System.out.println("DemoE类，也满足接口D的规则。。。");
	}
	
	@Override
	public void fun() {
		System.out.println("DemoE类，实现类fun方法。。。");
	}
}

public class Demo24 {

	public static void main(String[] args) {
		C c = new DemoE();
		c.testC();
		c.fun();
		
		
		D d = new DemoE();
		d.testD();
		d.fun();
		
		DemoE demoE = new DemoE();
		demoE.testC();
		demoE.testD();
	}

}
