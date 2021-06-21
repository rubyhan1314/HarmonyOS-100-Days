class Demo50 
{
	public static void main(String[] args) 
	{
		method1();
      	method2(10);
	}
  public static void method1() {
    //输出100~200之间能被3整除的数
	for(int i = 100;i <= 200;i++) {
		if(i % 3 != 0) {
			continue;
		}

		System.out.println(i);
	}
  }
  public static void method2(int num) {
    //判断一个数是否为质数
	//质数：除了1和本身能整除，如果出现一个数可以将这个数整除的话，那么这个数就不是质数
	//1.假设是质数
	boolean isPrime = true;
	//2.寻找能够整除num的数，只要出现一个，则原来的假设被推翻
	for(int i = 2;i < num;i++) {
		//3.大对小求余
		if(num % i == 0) {
			//4.修改原来假设的状态
			isPrime = false;
			break;
		}
	}
	return isPrime;
  }
}