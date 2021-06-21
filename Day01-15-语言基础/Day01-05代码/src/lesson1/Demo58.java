//演示不定长参数的使用
public class Demo58
{
	public static void main(String[] args) 
	{
		int result = add(2,5,65,76,87,98,9);
		System.out.println(result);

		//2.对于一个方法的参数是不定长参数时，实参可以直接传一个数组
		int[] arr = {2,5,65,76,87,98,9};
		System.out.println(add(arr));//num = arr;

		test(10,"hello",1,545,656);
		//test(1,545,656,"hello");
	}

	//需求：计算不确定个整数的和
	public static int add(int... num) {
		//1.不定长的参数在进行使用的时候被当做数组来进行处理
		//num其实就相当于一个数组的引用变量
		int sum = 0;
		for(int n :num) {
			sum += n;
		}

		return sum;
	}

	//3.不定长参数在使用的时候，必须出现在参数列表的最后一个
	//4.在同一个参数列表中，不定长参数只能出现一次
	public static void test(int num1,String s,int... num) {
	}
}