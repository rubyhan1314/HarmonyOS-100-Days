public class Demo59ArrayBubbleSort
{
	public static void main(String[] args) 
	{
		int[] arr = {54,26,93,17,77,31,44,55,20};
		//以升序为例
		//外层循环：控制比较的轮数
		for(int i = 0;i < arr.length - 1;i++) {
			//内层循环：控制每一轮比较的次数和参与比较的下标
			for(int j = 0;j < arr.length - 1 - i;j++) {
				if(arr[j] > arr[j + 1]) {
					//交换位置
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for(int num:arr) {
			System.out.print(num + "\t");
		}
		System.out.println();
	}
}