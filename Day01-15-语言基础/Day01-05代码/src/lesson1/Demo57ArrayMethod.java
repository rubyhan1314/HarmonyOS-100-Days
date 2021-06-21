public class Demo57ArrayMethod
{

	//设计一个方法，用于打印数组
	public static void printArray(int[] arr){//int[] arr = a;a的地址给了arr，那么arr和 a指向同一块内存的数组
		for(int e : arr){
			System.out.print(e +"\t");
		}
		System.out.println();
	}

	//设计一个方法，用于创建一个数组， 并赋值。数组要返回给调用处
	public static int[] createArray(int len){
		int[] arr = new int[len];
		for(int i = 0;i <arr.length;i++){
			arr[i] = i * 2;
		}
		return arr;
	}
	public static void main(String[] args) 
	{

		int[] a = {1,2,3,4,5};

		//设计一个方法，用于打印数组
		printArray(a);//将a的地址，传递给arr
		System.out.println("Hello World!");

		int [] b = createArray(10);

		for(int i =0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}