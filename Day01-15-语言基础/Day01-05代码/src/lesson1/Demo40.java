//演示参数的使用
class Demo40 
{
	public static void main(String[] args) 
	{
		//需求：交换两个变量的值

		//实参
		int a = 10;
		int b = 20;
		
		//调用函数
		swap(a,b);

		System.out.println("main函数中的a=" + a);//10
		System.out.println("main函数中的b=" + b);//20
	}

	//分析：需要参数（两个参数）
	//		不需要返回值
	//形参：没有携带值的变量，多个变量之间使用逗号分隔
	public static void swap(int a,int b) {
		//定义一个中间的临时变量
		int temp = 0;
		temp = a;
		a = b;
		b = temp;

		System.out.println("swap函数中的a=" + a);//20
		System.out.println("swap函数中的b=" + b);//10
	}
}