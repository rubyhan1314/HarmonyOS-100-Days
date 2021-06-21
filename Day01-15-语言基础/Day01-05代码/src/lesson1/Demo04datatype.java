public class  Demo04datatype
{
	public static void main(String[] args) 
	{
		//1.定义byte类型的变量
		byte num = 10;
		System.out.println(num);
		//存储的大小如果超过了byte的取值范围，就会报错了
		//byte num2 = 129;
		//System.out.println(num2);

		//2.short类型的变量，
		short s = 129;//取值范围：-32768~32767，共(65536个数值)
		System.out.println(s);

		//3.int类型的变量
		int i = 1314;//取值范围：-2147483648~2147483647
		System.out.println(i);

		//4.long类型的变量
		long l1 = 9223372036854775807L;//加L表示该数值是long类型的
		System.out.println(l1);


		int age = 19;
		long l2 = 100000000L;
	}
}
