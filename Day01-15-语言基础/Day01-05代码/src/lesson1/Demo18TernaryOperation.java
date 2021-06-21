/**
*三元运算符
*/
public class Demo18TernaryOperation 
{
	public static void main(String[] args) 
	{
		/*
		三元运算符：目的，根据条件，选择一种结果。
		运算符：
			  ?   :
			X ? Y : Z
			X：布尔类型的表达式：true/false
			Y：结果1
			Z：结果2

			X的值为true，那么整个三元运算符结果就是Y。
			X的值为false，那么整个三元运算符的结果就是Z。
		*/
		int score = 59;
		String res = score == 100 ? "满分" : "不是满分";
		System.out.println(res);

		//给定一个成绩，判断是否及格？及格，不及格

		String res2 = score >= 60 ? "及格" : "不及格";
		System.out.println(res2);


		String res3 = !(score < 60) ? "及格" :"不及格";
		System.out.println(res3);

		//给定一个数值，判断是正数还是负数，还是0
		int num = -5;
		String res4 = num > 0 ? "正数" : num < 0 ? "负数" : "0";
		System.out.println(res4);


	}
}
