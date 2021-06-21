import java.util.Arrays;
public class Demo62Search 
{
	/*
	* 二分查找
	*/
	public static int binarySearch(int[] arr,int key){
		//相应的下标
		int left = 0;
		int right = arr.length - 1;

		while(left <= right) {
			//中间下标
			int middle = (left + right) / 2;//取整
			if(arr[middle] > key) {
				//下次在左半部分查找
				right = middle - 1;
			} else if(arr[middle] < key) {
				//下次在右半部分查找
				left = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,3,4,6,7,8,10,13,14};

		//待查找的元素
		int key = 13;

		int result = binarySearch2(arr,key);

		System.out.println(result);
		
	}
}
