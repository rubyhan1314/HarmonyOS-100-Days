public class Demo52Array 
{
	public static void main(String[] args) 
	{
		/*
		静态初始化:由我们指定元素的初始值，由系统计算长度或者元素的个数
		*/
		int[] arr1 = new int[]{1,56,76,87};
		int[] arr2 = {1,56,76,87};

		String[] arr3 = new String[]{"hello","程序咖","Ruby"};
		String[] arr4 = {"hello","程序咖","Ruby"};


		char[] arr5 = new char[]{'2','g','*'};
		char[] arr6 ={'2','g','*'};

		/*
		动态初始化：初始化时由程序员指定数组的长度，系统负责分配元素的初始值
		*/
		int[] arr7 = new int[5];//0

		String[] arr8 = new String[3];//null

		char[] arr9 = new char[10];//\u0000

		/*
		int x = 4;
		x在栈空间中开辟空间
		4为常量，存储在常量池中

		char[] arr = new char[10];
		方法压栈：
		arr是一个变量名称
		arr也是在栈空间中开辟空间的
		通过new关键字创建出来的数组存储在堆空间中
		arr其实就是一个引用，指向了一个真正的数组
		*/

	}
}
