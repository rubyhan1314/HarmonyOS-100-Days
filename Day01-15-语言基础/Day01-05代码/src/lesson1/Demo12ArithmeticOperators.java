public class Demo12ArithmeticOperators
{
	public static void main(String[] args) 
	{
		int num = 520;
		String msg = "程序咖";
		System.out.println(msg + num);


		int a = 3;
		int b = 2;
		//打印a加b的和，为5
		System.out.println(a + b);//5
		//此处因为遇到""内容了， 那么后面的+都起连接作用
		System.out.println(a + " + " + b + " = " + a + b);//3 + 2 = 32
		//想求a加b，可以尝试用小括号括起来
		System.out.println(a + " + " + b + " = " + (a + b));//3 + 2 = 5
	}
}
