import java.util.Scanner;

public class Demo22If {

	public static void main(String[] args) {
		/*
		 * if (条件判断 true or false ) { // 条件结果为true执行大括号以内的语句
		 * 
		 * }
		 * 
		 * 执行流程： 代码运行到if分支结构，首先判断if之后的条件是否为true，如果为true，执行大括号里面的语句，
		 * 如果为false直接执行大括号之外的语句，
		 * 
		 */
		// 1.定义一个成绩，如果大于等于60，打印及格
		int score = 88;
		if (score >= 60) {
			// 条件结果为true执行大括号以内的语句
			System.out.println("及格。。");
		}
		
		System.out.println("over....");
		
		//2.定义一个整数，如果大于0，打印正数
		
		System.out.println("请输入一个整数：");
		Scanner scan =new Scanner(System.in);
		
		int num = scan.nextInt();

		
		if(num > 0){
			System.out.println(num + ",是正数。。");
			
		}
		
		System.out.println("over.........");

	}

}

