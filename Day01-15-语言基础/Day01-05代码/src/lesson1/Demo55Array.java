class Demo55Array 
{
	public static void main(String[] args) 
	{
		//使用静态初始化的方式初始化一个数组a
		int[] a = {5,7,20};
		System.out.println("a的长度为：" + a.length);//3

		//使用动态初始化的方式初始化一个数组b
		int[] b = new int[4];
		System.out.println("b的长度为：" + b.length);//4

		b = a;
		System.out.println("a的长度为：" + a.length);//3
		System.out.println("b的长度为：" + b.length);//3 

		String[] arr = new String[3];
	}
}