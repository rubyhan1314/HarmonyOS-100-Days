/**
*位运算
*/
public class Demo16BitOperators 
{
	public static void main(String[] args) 
	{
		
		//1.按位取反
		//定义一个int类型的整数
		int a = 79;
		//其实它对应的二进制表示：0100 1111

		System.out.println(Integer.toBinaryString(a));
		
		
		int res = ~a;
		/*
		* 按位取反：
		* a=79
		* 原始二进制：0100 1111
		* 按位取反后：1011 0000
		* 那么最终的计算结果，就是-80
		*/
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));

		//2.按位与
		int x = -53;
		int y = 109;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		/*
		*按位与
		*-53		1100 1011
		*109		0110 1101
		*按位与		0100 1001
		*结果为：73
		*/
		int res2 = x & y;
		System.out.println(res2);
		System.out.println(Integer.toBinaryString(res2));
		//3.按位或
		//int x = -53;
		//int y = 109;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		/*
		*按位或
		*-53		1100 1011
		*109		0110 1101
		*按位或		1110 1111
		*结果为：-17
		*/
		int res3 = x | y;
		System.out.println(res3);
		System.out.println(Integer.toBinaryString(res3));
		
		//4.按位或
		//int x = -53;
		//int y = 109;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		/*
		*按位异或
		*-53		1100 1011
		*109		0110 1101
		*按位异或	1010 0110
		*结果为：-90
		*/
		int res4 = x ^ y;
		System.out.println(res4);
		System.out.println(Integer.toBinaryString(res4));
		
		
	}
}

