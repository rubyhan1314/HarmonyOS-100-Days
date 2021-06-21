import java.util.Scanner;

public class Demo23IfElse {

	public static void main(String[] args) {
		/*
		 * if ( 条件判断 true or false ) { //二者必选其一
		 * 
		 * // true语句体 
		 * } else { 
		 * // false语句体
		 * 
		 * }
		 * 
		 * 执行流程: 代码运行到if-else结构时，首先判断if之后的条件是否为true，如果为true，执行if之后大括号内容，true语句体，
		 * 如果为false，执行else大括号内容，false语句体
		 */
			
		int score = 88;
		
		if(score >= 60){
			System.out.println(score+",及格");
		}else{
			System.out.println(score+"，不及格。。。");
		}
		
		System.out.println("over...");
		//判断性别，男就去男厕所，否则去女厕所
		
		/*
		 * 扩展：比较数值
		 * 基本数据类型：==，比较数值是否相等
		 * 	8个基本类型
		 * 
		 * 引用数据类型：equlas()，比较数据是否相等
		 * 	String
		 */
		System.out.println("请输入你的性别：");
		Scanner scan = new Scanner(System.in);
		String sex = scan.next();
		if("男性".equals(sex)){
			System.out.println(sex+",去男厕所。。");
		}else{
			System.out.println(sex+"，去女厕所。。");
		}
		
		
		System.out.println("----------------");
		
		
		char sex2 = '男';
//		int sex3 = 1;//1男，2女
//		boolean sex4 = true;//true男，false女
		
		if(sex2 == '男'){
			System.out.println("去男厕所。。");
		}else{
			System.out.println("去女厕所。。。。");
		}
		
		
		
	}

}

