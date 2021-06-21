/*
算术运算符
*/
public class Demo10ArithmeticOperators 
{
	public static void main(String[] args) 
	{
		/*
		算术运算符：+，-，*，/,%,++,--
		*/
		int a = 10;
		int b = 3;
		//1.正数负数
		System.out.println(+a);
		System.out.println(-b);
		//2.加减乘除
		int sum = a + b;//求a+b的和，将结果赋值给sum变量
		System.out.println(sum);
		int sub = a - b;//求a-b
		System.out.println(sub);
		int mul = a * b;//求aXb
		System.out.println(mul);
		//除法：取商，取余
		int div = a / b;//取商
		System.out.println(div);//3

		int mod = a % b;//取余，取模
		System.out.println(mod);//1

	}
}
