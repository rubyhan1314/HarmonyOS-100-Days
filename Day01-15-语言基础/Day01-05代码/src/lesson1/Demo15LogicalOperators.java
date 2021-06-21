/**
*逻辑运算符
*/
public class Demo15LogicalOperators
{
	public static void main(String[] args){
		/*
		逻辑运算符：&，|,!,&&,||,^
		&："与操作"
			运算规则：所有的操作数如果都为真，结果才为真，有一个为假，结果就为假

			总结：相当于"并且"。一假则假，全真才真。
				女生眼中的男生：一处错，就全盘否定。

		|："或操作"
			运算规则：所有的操作数如果都为假，结果才为假，有一个为真，结果就为真

			总结：相当于"或者"。一真则真，全假才假。
				男生眼中的女生：一个亮点，就全身发光。

		&&："短路与"
			运算结果和&操作是相同的。
			运算过程不同：&会将整个式子都计算，给一个最终的结果。
					      &&在计算过程中，如果遇到一个false，就直接返回结果为false，后面的不再计算了。

		||："短路或"
			运算结果和|操作是相同的。
			运算过程不同：|会将整个式子都计算，给一个最终的结果。
						  ||在计算过程中，如果遇到一个true，就直接返回结果为true，后面的不再计算
		
		
		!："取非，取反"
			!true--->false
			!false--->true

		^："异或"
			运算规则：不同为真，相同反而为假。
			异-->不同
			两个操作数，如果数值相同，异或的结果是假
						如果数值不同，异或的结果是真
		*/
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;

		boolean res1 = b1 & b2 & b3;
		System.out.println(res1);//false

		boolean res2 = b1 | b2 | b3;
		System.out.println(res2);//true

		boolean res3 = b1 && b2 && b3;
		System.out.println(res3);//false

		boolean res4 = b1 || b2 || b3;
		System.out.println(res4);


		boolean b4 = true;
		System.out.println(b4);//true
		System.out.println(!b4);//false

		boolean res5 = b1 ^ b2;//异或
		System.out.println(res5);//true
		boolean res6 = b1 ^ b3;
		System.out.println(res6);//false


	}
}