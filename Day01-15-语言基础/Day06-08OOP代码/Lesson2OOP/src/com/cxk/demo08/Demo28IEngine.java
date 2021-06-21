package com.cxk.demo08;

public class Demo28IEngine {

	public static void main(String[] args) {
		//买一辆车
		Car car = new Car();
		car.setAge(0);
		
		//创建发动机对象
		//接口类型  = new 实现类对象;
//		IEngine iEngine = new YAMAHA();
		IEngine iEngine = new HODNA();
		System.out.println(iEngine); //com.cxk.demo08.HODNA@15db9742
		
		
		car.setIEngine(iEngine);//将接口作为set方法的参数，传入该接口的任意实现类对象都可以。
		
		System.out.println(car.getAge());// 0
		System.out.println(car.getIEngine());
		
		car.testEngine();
	}

}
