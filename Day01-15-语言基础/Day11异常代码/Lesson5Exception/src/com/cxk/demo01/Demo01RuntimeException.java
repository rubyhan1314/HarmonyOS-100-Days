package com.cxk.demo01;
/**
 * 演示异常
 * @author hanru
 *
 */
public class Demo01RuntimeException {

	public static void main(String[] args) {
		

		int i =10;
		int j = 0;
		
		try {
			int div = i / j;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println("此处产生算术异常了。。");
		}
		
		System.out.println("main...over....");
		
//		Scanner scan =new Scanner(System.in);
//		int num = scan.nextInt();
//		System.out.println(num);
		
//		File file = new File("D:\\Ruby\\pro\\aa.jpeg");//D:\Ruby\pro
		
//		FileInputStream fis = new FileInputStream(file);
	}
}