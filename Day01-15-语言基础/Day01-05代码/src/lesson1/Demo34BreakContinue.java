public class Demo34BreakContinue {

	public static void main(String[] args) {
		/*
		 * 循环如何结束?
		 * 
		 * 正常情况下，循环条件不成立，循环就自动结束了。
		 * 
		 * break：词义“打破，破坏” 
		 * 
		 * 用法一：在switch-case语句中，用于结束switch语句
		 * 
		 * 用法二：在循环语句中，一个循环中，一旦执行了break语句，那么该循环就彻底的结束了，无论循环条件是否满足。
		 * 
		 * continue：词义"继续"
		 * 	循环中，用于结束某一次循环，下次继续执行。
		 * 	"跳过"的意思
		 * 
		 */

		for (int i = 1; i <= 10; i++) {
			if(i == 5){
//				break;//强制结束循环
				continue;
			}
			System.out.println(i);
		}
		System.out.println("over...");
	}

}

