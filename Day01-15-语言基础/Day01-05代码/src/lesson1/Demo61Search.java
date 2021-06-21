class Demo61Search
{
	/*
	*顺序查找，在数组arr中，查找key的位置，如果存在返回下标，否则返回-1
	*/
	public static int orderSearch(int[] arr,int key){
		for(int i = 0;i < arr.length;i++) {
			if(key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr = {23,54,65,3,5,2,87};

		//需求：查找65在数组中的位置
		int key = 65;

		int result = orderSearch(arr,key);

		System.out.println(result);
		
	}
}