//step1：导入Scanner
import java.util.Scanner;//导入java.util包下Scanner这个类，那么在程序中就可以使用Scanenr。

public class Demo19Scanner
{
	public static void main(String[] args){
		//step2：创建一个扫描器对象，才可以读取键盘输入
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的成绩(整数)：");

		//step3：读取键盘输入的数据：
		int score = input.nextInt();//读取键盘上输入的一个整数
		
		System.out.println("你的成绩是：" + score);

		String msg = score >= 60? "及格" : "不及格";
		System.out.println("成绩为：" + msg);
	}
}