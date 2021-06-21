public class Demo30DoWhile {

	public static void main(String[] args) {
		/*
		 *  do{
		 *		语句块;
		 *
		 *	}while (boolean表达式);
		 *  
		 */
		//使用do-while循环，打印1-10的 数字
		
		int i = 1;

		do{
			System.out.println(i);
			i++;
		}while(i<=10);
		

		
		System.out.println("i--->"+i);
	}

}

