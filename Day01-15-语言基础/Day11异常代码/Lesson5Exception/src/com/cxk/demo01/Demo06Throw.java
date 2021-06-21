package com.cxk.demo01;
/**
 * 
 * @author hanru
 *
 */
public class Demo06Throw {

	public static void main(String[] args) {
		Exception e = new Exception("自己抛着玩的");
		try {
			throw e;//程序中主动抛出一个异常对象,什么时候自己扔了异常，打断程序的执行。。
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		System.out.println("main..over...");
		
		String s1 = "Ruby";
		s1.charAt(0);
	}

}

