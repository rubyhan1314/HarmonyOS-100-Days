class Demo43 
{
	public static void main(String[] args) 
	{
		show();
	}
	/*
	1>在没有返回值的函数中使用return
			return单独成立一条语句，类似于break或者continue，后面不能跟任何的数值
			作用：结束整个方法
	*/
	public static void show() {
		System.out.println("Hello World!");

		int x = 10;
		if(x > 5) {
			return;//在某些情况下，可以使用return替换break
		}

		// 错误: 无法访问的语句
		System.out.println("Hello World!========");
	}
}