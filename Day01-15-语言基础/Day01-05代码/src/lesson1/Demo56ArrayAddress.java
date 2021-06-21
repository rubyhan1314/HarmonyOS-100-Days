public class Demo56Array
{
	public static void main(String[] args) 
	{
		/*
		数组：引用类型的数据
			数组名，存储是引用地址。
		*/

		int[] a = new int[3];
		System.out.println(a.length);//3
		System.out.println(a);//a数组的地址
		System.out.println(a[0]);//0

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		int[] b = {4,5,6,7};
		System.out.println(b.length);//4
		System.out.println(b);//b的地址
		System.out.println(b[0]);//4

		int[] c = a;//将a的值赋值给c，就是将a存储的数组的地址赋值给c
		//a和c存储的地址相同，那么就指向了同一个数组
		System.out.println(c.length);//3
		System.out.println(c);//a的地址
		System.out.println(c[0]);//1

		c[0] = 100;
		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);


		b = c;

		b[1] = 200;
		System.out.println(a[1]);//200
		System.out.println(b[1]);//200
		System.out.println(c[1]);//200

		System.out.println("Hello World!");
	}
}

