public class Demo29While {

	public static void main(String[] args) {
		/*
		 *  while (boolean表达式) {语句块}
		 *  
		 *  示例：
		 *  while(活着){
		 *  	心脏跳一下
		 *  }
		 */
		//使用while循环，打印1-100的 数字
		
		int i = 1;
		
		while(i <= 100){
			System.out.println(i);//1,2,3,4...100
			i++;
		}
		
		System.out.println("i--->"+i);
	}

}

