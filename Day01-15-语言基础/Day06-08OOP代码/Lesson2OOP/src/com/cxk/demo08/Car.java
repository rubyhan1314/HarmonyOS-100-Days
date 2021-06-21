package com.cxk.demo08;
/**
 * 设计Car小汽车这个类：小汽车有车龄(int)，小汽车有发动机(接口)
 * @author hanru
 *
 */
public class Car {
	//...
	private int age;//车龄，也是属性，但是仅仅只是一个数值

	//最重要的一步：表示发动机,接口类型，传入任意的实现类对象即可
	private IEngine iEngine;//将一个接口作为另一个类的属性。本质是引用类型：对象
	
	
	
	//测试发动机性能：测试这个发动机对象的那些功能方法
	public void testEngine(){
		iEngine.start();//通过接口引用，执行接口中的方法。这就是接口回调
		iEngine.speedUp();
		iEngine.stop();
	}
	
	
	public Car(){
		
	}
	
	public Car(int age,IEngine iEngine){
		this.age = age;
		this.iEngine =iEngine;
	}
	
	
	
	
	//提供getter和setter
	public void setAge(int age){
		this.age = age;
	}
	
	public void setIEngine(IEngine iEngine){
		this.iEngine = iEngine;
	}
	
	public int getAge(){
		return this.age;
	}
	public IEngine getIEngine(){
		return this.iEngine;
	}
}
