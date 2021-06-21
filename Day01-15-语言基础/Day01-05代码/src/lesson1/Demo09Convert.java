public class Demo09Convert 
{
	public static void main(String[] args) 
	{
		//1.自动类型转换：取值范围小的自动转为取值范围大的。
		short s1 = 123;//
		int i1 = s1;//隐含着将s1这个数值由short类型转为int，再赋值给i1这个变量
		System.out.println(s1);
		System.out.println(i1);

		byte b1 = 10;
		int i2 = b1;//byte-->int
		System.out.println(i2);

		//2.强制类型转换
		//byte的取值范围：-128~127之间
		byte b2 = (byte)s1;//将s1由short类型，强制转为byte类型，再赋值给byte类型的变量b2
		System.out.println(b2);//123

		short s2 = 128;
		byte b3 = (byte)s2;//-128
		System.out.println(b3);

		double d1 = 2.5;
		int i3 = (int)d1;//强制转换：浮点到整数：直接截取整数部分，忽略小数
		System.out.println(i3);

		long l1 = 100L;
		float f1= l1;
		System.out.println(f1);


	}
}
