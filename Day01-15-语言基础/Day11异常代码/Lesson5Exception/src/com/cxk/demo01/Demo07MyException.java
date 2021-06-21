package com.cxk.demo01;
/**
 * 我自己定义的异常
 * @author hanru
 *
 */
class MyException extends Exception{
	//提供有参构造方法。。
	public MyException(String msg){
		super(msg);//调用父类的有参构造：提供异常的信息
	}
	
	public MyException(){
		super();//父类的无参构造，没有提供异常的信息
	}
	
}
public class Demo07MyException {
	
	
	/*
	 * 设计一个方法，用于检验年龄，年龄不合法，抛出一个异常
	 */
	public static void checkAge(int age) throws MyException{
		if(age < 0){
//			return;
			throw new MyException("年龄不能为负数。。");
		}
		System.out.println("年龄输入正确，请继续。。。");
	}
	
	public static void checkName(String name){//"" , null
		if(name== null || name.length() == 0){
			throw new RuntimeException("请正确输入用户名，为空。。");
		}
		System.out.println("用户名正确，请继续。。。");
	}

	public static void main(String[] args) {
//		MyException e = new MyException("我自己抛着玩的");
//		try {
//			throw e;
//		} catch (MyException e1) {
//			e1.printStackTrace();
//			System.out.println("我自己定义的异常。。。");
//		}
		
//		try {
//			checkAge(-30);//调用处
//		} catch (MyException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("go on....");
		
		
		checkName("");
		
 	}

}
