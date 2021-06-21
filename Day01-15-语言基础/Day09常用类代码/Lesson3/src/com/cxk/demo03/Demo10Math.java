package com.cxk.demo03;
/**
 * Math类，都是数学相关的静态方法。可以通过类名直接访问。
 * @author hanru
 *
 */
public class Demo10Math {

	public static void main(String[] args) {
		System.out.println(Math.PI);//圆周率，3.141592653589793
		
		//取绝对值
		System.out.println(Math.abs(100));//绝对值
		System.out.println(Math.abs(-100));
		
		//向上取整
		System.out.println(Math.ceil(3.00001));//返回大于或等于参数的最小（最接近负无穷大） double值，等于一个数学整数。 
		//向下取整
		System.out.println(Math.floor(4.1));
		//四舍五入
		System.out.println(Math.round(3.49));
		
		double num = 3.4;
		System.out.println(Math.floor(num + 0.5));//效果是四舍五入吗？
		
		
		//a的b次方
		System.out.println(Math.pow(2, 3));//a的b次方
		System.out.println(Math.pow(3, 2));
		
		
		//开平方
		System.out.println(Math.sqrt(9));//根号9-->3
		System.out.println(Math.sqrt(8));//根号8-->2倍根号2
		
		
		//最大值，最小值
		System.out.println(Math.max(3, 6));//获取较大的值
		System.out.println(Math.min(1, 5));//获取较小的值
				
	}
}
