/**
*赋值运算符
*/
public class Demo13AssignmentOperators 
{
	public static void main(String[] args) 
	{
		/*
		赋值运算符：=，+=，-=，*=，/=,%=
			=：将=右侧的数值，赋值给=左侧的变量
			+=: a += b;//相当于：a = a + b
			-=: a -= b;//相当于：a = a - b
			*=：a *= b;//相当于：a = a * b
			/=：a /= b;//相当于：a = a / b
			%=：a %= b;//相当于：a = a % b
		*/
		int a = 3;//将3这个数值，赋值给变量a
		System.out.println(a);


		a += 2;//相当于：a = a + 2，就是将a加2后，再赋值给a
		System.out.println(a);//5

		a -= 1;//相当于：a = a - 1
		System.out.println(a);//4


		a %= 2;//相当于：a = a % 2
		System.out.println(a);//0

		a = 2;
		int b = 3;
		a *= ++b; // 相当于a =a*(++b)
		System.out.println(a);//8
		System.out.println(b);//4


	}
}
