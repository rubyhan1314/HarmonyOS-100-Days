public class  Demo65Array
{
	public static void main(String[] args) 
	{
		//1.数组越界
		int[] arr1 = new int[]{2,65,76,83,32,5,5};
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
        at Demo65Array.main(Demo65Array.java:6)
		*/
		//System.out.println(arr1[8]);

		//2.空指针异常
		System.out.println(arr1[3]);
		//arr1 = null;
		/*
		Exception in thread "main" java.lang.NullPointerException
        at Demo65Array.main(Demo65Array.java:20)
		*/
		//System.out.println(arr1[3]);

		//3.基本数据类型和引用数据类型打印的区别
		int x = 4;
		System.out.println(x);//4
		System.out.println(arr1);//[I@15db9742

		/*
		打印引用数据类型的引用变量时，拿到的是地址

		[I@15db9742

		[ ----- 数组
		I ----- int【Integer】
		@ ------ 地址
		15db9742 ----- 十六进制，地址值的哈希编码【哈希算法】

		打印：
		基本数据类型：数值
		引用数据类型：地址值
		*/

		float[] arr2 = new float[10];
		System.out.println(arr2);//[F@6d06d69c

		String[] arr3 = new String[10];
		System.out.println(arr3);//[Ljava.lang.String;@7852e922
	}
}