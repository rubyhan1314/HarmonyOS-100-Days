public class Demo54Array 
{
	public static void main(String[] args) 
	{
		//1.定义数组
		int [] arr = {1,3,5,7,9};

		//2.遍历数组
		int n0 = arr[0];
		int n1 = arr[1];
		int n2 = arr[2];
		int n3 = arr[3];
		int n4 = arr[4];


		//3.简单for循环
		//i表示下标，0~arr.length
		for(int i = 0;i < arr.length;i++) {
			int n = arr[i];
			System.out.println(n);
		}

		/*
		4.增强for循环【foreach】
		JDK1.5之后新增的
		优点：用于遍历数组和集合，无需通过数组下标，就可以直接访问数组或者集合中的元素
		语法：
		for(元素数据类型 变量名：数组名称) {
			System.out.println(变量名);
		}
		*/
		//底层工作原理：根据下标获取数组元素
		for(int num : arr) {
			System.out.println("增强for循环的结果：" + num);
		}

		/*
		两种遍历方式的选择：不需要知道下标，只需要获取元素值，则采用增强for循环
		*/

		//需求：打印下标为偶数的元素值【只能采用简单for循环】
		for(int i = 0;i < arr.length; i++) {
			arr[i] = i*2;
		}
		for(int i =0;i < arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}
