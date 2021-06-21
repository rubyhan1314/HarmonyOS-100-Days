package com.cxk.demo01;

/**
 * try...catch
 * 
 * @author hanru
 *
 */
public class Demo02RuntimeException {

	public static void main(String[] args) {

		try {
			int i = Integer.parseInt("10");
			int j = Integer.parseInt("s");
			int div = i / j;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println("此处产生算术异常了。。");
		} catch (NumberFormatException e) {
			System.out.println("此处产生数字格式化异常了。。");
		}

		System.out.println("main...over....");

	}
}