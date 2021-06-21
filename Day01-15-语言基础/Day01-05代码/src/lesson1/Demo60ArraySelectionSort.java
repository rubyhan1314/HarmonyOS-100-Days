class Demo60ArraySelectionSort
{
	public static void main(String[] args) 
	{
		int[] arr = {54,26,93,17,77,31,44,55,20};

		for (int i= 0;i < arr.length - 1;i++){
			//用于标记最小值的下标
			int minIndex = i;

			for(int j = i + 1; j < arr.length; j++){
				//记录最小值的下标
				if(arr[minIndex] > arr[j]){
					minIndex = j;
				}
			}
			if (minIndex != i){
				//交换
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}

		}

		for(int num:arr) {
			System.out.print(num + "\t");
		}
		System.out.println();
	}
}