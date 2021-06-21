/**
*算术运算符
*/
public class Demo11ArithmeticOperators 
{
	public static void main(String[] args) 
	{
		/*
		i++,++i，自增1
			i++和++i，都是给i进行加1运算
			执行结束后，i的值都会加1的。

			区别：过程不一样
				i++的值相当于i本身。执行之后，i给自己加了1.
					先计算，再加1

				++i的值相当于i+1.
					先加1，再计算

		i--,--i，自减1
		*/
		//1.自增和自减
		int x = 3;
		System.out.println(x);//3

		x++;//给自己自增1
		System.out.println(x);//4

		x--;//给自己自减1
		System.out.println(x);//3
		System.out.println("-----------");
	
		//2，前加和后加
		int i = 3;
		System.out.println(i);//3
		System.out.println(i++);//3
		System.out.println(i);//4

		i = 3;
		System.out.println(++i);//4
		System.out.println(i);//4
		System.out.println("-----------");

		//3.参与其他运算
		int j = 2;
		int res = j++ + 3; //2 + 3=5
		System.out.println(res);//5
		System.out.println(j);//3

		j = 2;
		res = ++j + 3; //3 + 3
		System.out.println(res);//6
		System.out.println(j);//3

		i = 2;
		i = i++;
		System.out.println(i);//2
	}
}
