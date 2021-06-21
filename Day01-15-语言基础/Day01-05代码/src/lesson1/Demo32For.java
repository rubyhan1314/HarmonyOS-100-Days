public class Demo32For {

	public static void main(String[] args) {
		/*
		 * for循环
		 * 标准的写法for循环：
		 * for(表达式1；表达式2；表达式3){
		 * 	循环体；
		 * }
		 * 
		 * for循环还有特殊的写法：
		 * 1、表达式2如果省略：永真，死循环
		 * 		循环条件默认是true。
		 * 
		 * 2、表达式3如果省略：
		 * 		本来是在循环体之后执行的，通常用于控制循环变量的变化。
		 * 	
		 * 3、表达式1如果省略：
		 * 
		 * 4、表达式1,2,3全都省略不写
		 * 	for(;;){}
		 * 	while(true){}
		 * 
		 * 5、for循环里，如果只有一行代码，{}也可以省略不写的。不建议。
		 */
		int i = 1;
		
		for(; i <= 10;i++)
			System.out.println(i);
		
		
		System.out.println("helloworld");
			
			
//		System.out.println("--->"+i);
	}

}

