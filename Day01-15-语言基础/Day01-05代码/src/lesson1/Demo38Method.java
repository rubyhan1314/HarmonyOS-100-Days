public class Demo38Method {
	

	public static void main(String[] args) {
		/*
		 * 方法的注意点：
		 * 1、方法只有声明，没有调用。那就白写了。
		 * 2、方法没有声明，直接调用。那么报错。该方法未定义。
		 * 3、方法的声明位置，类里，其他方法外。关键是在哪里调用。
		 * 4、同一个类中，方法名不能冲突。
		 * 
		 * 补充：局部变量，方法里声明的变量。在哪个方法中声明的变量，就只能在哪个方法中使用。作用域。
		 */
		
		test2();
	}
	
	
	public static void test1(){
		System.out.println("test1()方法。。");
		int num = 100;
		test2();
		
	}
	public static void test2(){
		System.out.println("test2()方法。。");
//		System.out.println(num);//报错
		test1();
	}
//	public static void test2(){
//		System.out.println("我是另一个方法。。。");
//	}

}

