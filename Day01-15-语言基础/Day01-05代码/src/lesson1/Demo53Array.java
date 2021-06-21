public class Demo53Array 
{
	public static void main(String[] args) 
	{
		//使用静态初始化的方式定义一个数组
		//数组中可以存放重复数据
		int[] arr1 = new int[]{2,65,76,83,32,5,5};

		//1.访问数组中的元素
		//格式：数组名称[下标]    表示获取指定下标所对应的值
		//需求：获取下标3对应的元素
		int num1 = arr1[3];
		System.out.println(num1);//83
		System.out.println(arr1[3]);//83

	
		//2.修改数组元素的值
		int num2 = arr1[6];
		System.out.println(num2);//5
		num2 = 100;
		System.out.println(num2);//100
		System.out.println(arr1[6]);//5
		
		//格式：数组名称[下标] = 被修改之后的值
		//注意：不管是静态初始化还是动态初始化，都可以采用这种方式修改元素的值
		arr1[6] = 100;
		System.out.println(arr1[6]);//100

		//3.如果下标超出数组的长度，会下标越界异常
		//System.out.println(arr1[10]);

		//4.获取数组中的元素个数或者数组的长度
		//格式:数组名称.length;
		int len = arr1.length;
		System.out.println("数组arr1的长度为：" + len);	

	}
}
