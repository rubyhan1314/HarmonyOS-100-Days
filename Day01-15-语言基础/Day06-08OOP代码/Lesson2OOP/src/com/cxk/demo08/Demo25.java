package com.cxk.demo08;
//表示一种协议，一种规则
interface H{
	public void testH();
	public void fun();
}
//继承？is - a，子类是一个特殊的父类
class M{
	public void testM(){
		System.out.println("我是M类的方法。。");
	}
	
	public void fun(){
		System.out.println("M类中的fun方法。。。");
	}
}
//定义一个类：N
//继承了父类M：意味着N这个类可以直接使用父类的非私有化的属性和方法。
//同时实现接口H：意味着满足接口H中的所有规则：抽象方法。。
class N extends M implements H{

	@Override
	public void testH() {
		System.out.println("满足了接口H的协议规则。。");
	}
	
	//父类的fun方法，一旦存在继承关系，相当于子类也有一份。
//	public void fun(){
//		System.out.println("M类中的fun方法。。。");
//	}
}
public class Demo25 {

	public static void main(String[] args) {
		//课间思考题：一个类可以继承父类的同时，再实现接口吗？
		
		M m = new N();//父类引用，指向子类的对象：一种对象的多态
		m.testM();
		m.fun();
		
		System.out.println("-----------------");
		
		H h = new N();//接口引用，指向实现类对象：一种接口的多态
		h.testH();
		h.fun();
		
	}

}
