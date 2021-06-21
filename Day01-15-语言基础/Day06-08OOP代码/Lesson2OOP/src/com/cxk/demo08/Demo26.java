package com.cxk.demo08;
interface K{
	public void test1();
	public void test2();
}
/**
 * 抽象类实现接口
 * @author hanru
 *
 */
abstract class KImpl implements K{
	@Override
	public void test1() {
		
	}
}
/**子类继承抽象父类，那么要实现父类中所有的抽象方法，包含抽象父类实现接口来的
 * 
 * @author hanru
 *
 */
class L extends KImpl{

	@Override
	public void test2() {
		
	}
	
}
public class Demo26 {

	public static void main(String[] args) {
		
	}

}
