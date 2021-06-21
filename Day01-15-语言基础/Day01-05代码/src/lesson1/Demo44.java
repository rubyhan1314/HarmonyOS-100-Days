class  Demo44
{
	public static void main(String[] args) 
	{
		int result =  add(10,20);
		System.out.println(result);

		System.out.println(add(11,22));

		//如果一个函数返回值类型为void，则不能再调用函数的同时直接打印
		// 错误: 此处不允许使用 '空' 类型
		//System.out.println(show(11,22));
		show(11,22);
	}

	/*
	2>在一个有返回值的函数中使用return
			这种情况下函数中必须出现return
			return后面必须跟一个具体的数值，而且数值的类型和返回值类型必须保持一致
			作用：结束整个方法，并且将返回值携带给调用者
	*/

	//需求：求两个变量的和
	public static int add(int a,int b) {
		int sum = a + b;
		//谁调用，返回给谁
		//return每次只能携带一个数据返回
		return sum;
	}

	public static void show(int a,int b) {

		int sum = a + b;
		System.out.println(sum);
	}
}