//演示Arrays工具类的使用
import java.util.*;
class Demo63Arrays 
{
	public static void main(String[] args) 
	{
		//使用动态初始化的方式初始化一个数组
		int[] arr = new int[10];
		
		//1.填充
		/*
		static void fill(int[] a, int val) 
          将指定的 int 值分配给指定 int 型数组的每个元素。 
		static void fill(int[] a, int fromIndex, int toIndex, int val) 
          将指定的 int 值分配给指定 int 型数组指定范围中的每个元素。 

		*/
		/*
		for(int n:arr) {
			System.out.print(n);
		}
		*/
		//Arrays.fill(arr,10);

		//Java但凡涉及到区间问题，一般规律：包头不包尾   前闭后开区间
		Arrays.fill(arr,2,6,56);//0~arr.length - 1


		//2.排序
		/*
		static void sort(int[] a) 
          对指定的 int 型数组按数字升序进行排序。 
		static void sort(int[] a, int fromIndex, int toIndex) 
          对指定 int 型数组的指定范围按数字升序进行排序。 
		*/
		//注意：默认情况下只能进行升序排序
		int[] arr1 = {43,2,65,1,45,9898,989};
		Arrays.sort(arr1);
		//Arrays.sort(arr1,2,5);//[2,5)

		//3.二分法查找
		//前提：必须是排好序的数组
		/*
		static int binarySearch(int[] a, int key) 
          使用二分搜索法来搜索指定的 int 型数组，以获得指定的值。 
		static int binarySearch(int[] a, int fromIndex, int toIndex, int key) 
          使用二分搜索法来搜索指定的 int 型数组的范围，以获得指定的值。 
		*/
		/*
		1
		2
		43
		45
		65
		989
		9898
		*/
		int key = 45;
		int result1 = Arrays.binarySearch(arr1,key);
		System.out.println(result1);//3

		int result2 = Arrays.binarySearch(arr1,20);
		//规律：按照原来的顺序将待查找的元素插入到原数组中的下标，对下标加1然后求相反数
		System.out.println(result2);


		//4.拷贝
		/*
		static int[] copyOf(int[] original, int newLength) 
          复制指定的数组，截取或用 0 填充（如有必要），以使副本具有指定的长度。 
		static int[] copyOfRange(int[] original, int from, int to) 
          将指定数组的指定范围复制到一个新数组。 
		*/
		int[] newArr1 = Arrays.copyOf(arr1,3);

		int[] newArr2 = Arrays.copyOfRange(arr1,2,6);

		//5.将数组转换为字符串
		System.out.println(arr1);//[I@15db9742

		/*
		static String toString(int[] a) 
          返回指定数组内容的字符串表示形式。 
		*/
		System.out.println(Arrays.toString(arr1));//[1, 2, 43, 45, 65, 989, 9898]

		//6.比较数组
		/*
		static boolean equals(int[] a, int[] a2) 
          如果两个指定的 int 型数组彼此相等，则返回 true。 
		*/
		/*
		如果两个指定的 int 型数组彼此相等，则返回 true。
		如果两个数组包含相同数量的元素，并且两个数组中的所有相应元素对都是相等的，则认为这两个数组是相等的。
		换句话说，如果两个数组以相同顺序包含相同的元素，则两个数组是相等的。
		此外，如果两个数组引用都为 null，则认为它们是相等的
		*/
		int[] array1 = {1,54,76};
		int[] array2 = {1,54,76};
		System.out.println(Arrays.equals(array1,array2));//true
		System.out.println(array1 == array2);//false

		/*
		总结：
		==和equals
		==：是一个运算符，可以比较基本数据类型和引用数据类型【当比较引用数据类型的时候，比较的地址值】
			比较String类型的变量，采用equals   
			String str1 = "";
			String str2 = "";
			比较方式：str1.equals(str2);
		equals：是一个方法，只能比较引用数据类型
		【补充：如果equals方法在一个类中没有没重新实现，则equals方法的作用和==一样，都比较的是地址值
		如果equals方法在一个类中被重新实现，则比较的是内容
		】
		*/

		for(int n:newArr1) {
			System.out.println(n);
		}
	}
}