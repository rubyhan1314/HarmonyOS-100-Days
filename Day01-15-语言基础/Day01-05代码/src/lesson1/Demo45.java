class  Demo45
{
	public static void main(String[] args) 
	{
		int result = compare(34,67);
		System.out.println(result);
	}
	/*
	3>如果一个自定义的函数有返回值，并且在方法中遇到了分支结构，使用return
			在每一个分支后面都需要出现一个return
	*/
	//需求：比较两个变量的大小，返回较大的一个
	public static int compare(int num1,int num2) {
		//多分支
		/*
		if(num1 > num2) {
			return num1;
		} else if(num1 < num2) {
			return num2;
		} else {
			return num1;
		}
		*/

		//出现的问题：在使用单分支的时候，分支内部有return，这时编译还是不通过
		//解决办法：在单分支的外面再添加一个返回值，返回值随意，只要类型和返回值类型匹配就ok
		//单分支
		if(num1 > num2) {
			return num1;
		}

		//没有实际意义，作用只是为了匹配语法
		return 0;	 
	}
}