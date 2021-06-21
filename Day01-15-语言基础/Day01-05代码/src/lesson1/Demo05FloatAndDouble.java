public class Demo05FloatAndDouble 
{
	public static void main(String[] args) 
	{
		//1.单精度浮点数：float
		float f = 3.14f;
		System.out.println(f);

		//2.双精度浮点数：double
		double d = 1.23;//java中的小数，默认类型是double
		System.out.println(d);


		//科学计数法
		double d2 = 2000;//int,隐含了数据类型的自动转换
		System.out.println(d2);

		double d3 = 2000.0;//double
		System.out.println(d3);

		double d4 = 2E3;//相当于2*10的3次方
		System.out.println(d4);

		//1.7E308,相当于1.7乘以10的308次方。17后有307个0
		double d5 = 17000000000000000000000000.0;//double
		System.out.println(d5);


		//1.浮点类型：IEEE754标准。
	}
}
