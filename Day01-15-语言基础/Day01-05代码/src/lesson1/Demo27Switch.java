public class Demo27Switch {

	public static void main(String[] args) {
		/*
		 * switch-case语句的注意点：
		 * 1、switch和if不同：
		 * 		if作用在boolean类型上。
		 * 		switch作用在int，char，byte，short，enum，String这些类型上。
		 * 
		 * 2、default语句，是可选的。
		 * 
		 * 3、case后的数值，必须是唯一的。
		 * 
		 * 4、case是没有顺序的。
		 * 
		 * 5、break语句：词义"打破，打碎，破坏"的意思。用于防止switch的穿透。
		 * 
		 * 		switch的穿透：某个case匹配成功之后，执行该case后的内容，遇到break结束。
		 * 		但是如果没有break语句，那么后面的case不再匹配了，直接执行，这个现象就叫做switch的穿透。
		 * 	
		 */
		/*
		 * 周1、3、5：方便面
		 * 周2、4、6：喝粥
		 * 周7：不吃
		 */
		
		int weekday = 1;
		
		switch (weekday) {
		case 1:
		case 3:
		case 5:
			System.out.println("方便面");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("喝粥");
			break;
		case 7:
			System.out.println("不吃");
			break;
		default:
			System.out.println("信息有误");
			break;
		}
	}

}

