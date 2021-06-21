public class Demo42Return {

	public static void main(String[] args) {
		/*
		 * return语句：
		 * 	用法：1、将结果返回给调用处。2、结束该方法的执行。
		 * 
		 * 
		 * 注意点：
		 * 1、如果一个方法声明有返回值(不是void)，那么方法中必须使用return语句，返回结果。
		 * 
		 * 2、方法声明的返回值类型，和return语句后的数据类型一致。但是包含那些能够自动转型的类型
		 * 返回值类型int：int，byte，short，char
		 * 返回值类型double：byte，short，int，long，float，double
		 * 
		 * 3、如果一个方法声明有返回值，方法中有分支语句，循环语句。。无论执行哪个分支，最终有return语句可以执行。
		 * 
		 * 4、return用于返回结果，并强制结束该方法的执行。习惯上return语句往往是方法中的最后一行代码。
		 * 
		 * 5、如果一个方法声明没有返回值类型，void，方法中
		 */
//		System.out.println(test1());
//		  System.out.println(test5());
//		  
//		  test6();
		test7();
	}
	
	public static int test1(){
		return 200;
	}
	
	public static int test2(){
		byte i = 100;
		return i;
	}
	
	public static int test3(){
		int age = 30;
		if(age < 0){//if,switch,for,while,do-while
			return 0;
		}else{
			return age;
		}
	}
	public static int test4(){
		return 0;//返回结果，并结束该方法的执行。
//		System.out.println("haha");
	}
	
	public static int test5(){
		int age = 10;
		if(age < 0){
			return 0;//返回结果，结束方法
		}
		System.out.println("...."+age);
		return age;
	}
	
	public static void test6(){
		int age = -30;
		if( age < 0){
			return ;//没有返回，只用于结束方法
		}
		System.out.println("你的年龄："+age);
	}
	
	public static void test7(){
		for(int i=1;i<=10;i++){
			if (i==5){
//				break;//强制结束循环语句
				return;
			}
			System.out.println(i);
		}
		System.out.println("test7..over...");
	}

}

