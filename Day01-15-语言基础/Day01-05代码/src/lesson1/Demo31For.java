public class Demo31For {

	public static void main(String[] args) {
		/*
		 * for (表达式1 [循环变量初始值设定]; 表达式2 [循环条件判断]; 表达式3 [改变循环变量的值])｛
         	循环体//4
			｝
			
			先执行表达式1：只执行1次。习惯用于变量的初始化。
			
			表达式2：作为循环的条件，必须是boolean类型：true，false
			
			为true，执行循环体
			
			再执行表达式3：跟在循环体之后执行的，习惯用于变量的变化。步长。
			
			1-->2-->4-->3-->2-->4-->3-->2-->4-->3-->2...
			
		 */
		//1.打印10次helloworld
		for ( int i = 1;i<=10 ; i++){
			//循环体//4
			System.out.println("Hello World..--->"+i);//i:1,2,3,4...10
		}
		System.out.println("over...");
//		System.out.println(i);//11
	}

}

