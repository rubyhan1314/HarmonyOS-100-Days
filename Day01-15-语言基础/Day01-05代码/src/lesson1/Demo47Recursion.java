public class Demo47Recursion 
{
	public static int getSum(int n){
		if(n == 1){

			return 1;

		}

		return getSum(n-1)+n;

	}
	public static void main(String[] args) 
	{
		int sum = getSum(5);

		System.out.println(sum);
	}
}

