/*
*关系运算符
*/
public class Demo14RelationalOperators 
{
	public static void main(String[] args) 
	{
		/*
		关系运算符：表示两个数的关系的，计算结果是boolean类型的。True,False
		>,<,>=,<=,==,!=

		==，比较两个数值相等。如果相等，结果就是true，否则就是false
		!=，
		*/
		int a = 4;
		int b = 4;
		boolean res = a > b;

		boolean res2 = a <= b;

		System.out.println(res);//true

		System.out.println(res2);//false

		boolean res3 = a == b;// 4 == 4,true
		System.out.println(res3);

		boolean res4 = a != b;// 4!= 4,false
		System.out.println(res4);//false
	}
}
