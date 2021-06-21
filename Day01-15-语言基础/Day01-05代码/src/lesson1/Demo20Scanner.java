//1.导入Scanner
import java.util.Scanner;
public class Demo20Scanner 
{
	public static void main(String[] args) 
	{
		//2.创建Scanner扫描器
		Scanner input = new Scanner(System.in);


		//3.读取键盘输入的数据
		System.out.println("请输入一个小数：");
		double num1 = input.nextDouble();//读取键盘上输入的小数double类型的
		System.out.println("读取到的小数是：" + num1);

		

		System.out.println("请输入一个字符串：");
		String str = input.next();//读取键盘上输入的一个字符串
		System.out.println("接收到的字符串是：" + str);

		System.out.println("请输入一个字符：");
		char c = input.next().charAt(0);//读取键盘上输入的单个字符

		System.out.println(c);
		
	}
}
