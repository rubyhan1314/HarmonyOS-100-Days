
//程序咖
public class Demo39Param {

	public static void main(String[] args) {
		/*
		 * 参数：
		 * 形式参数：简称形参。声明方法的时候，用于接收外部传入的数据。
		 * 实际参数：简称实参。调用方法的时候，传给形参的具体的赋值。
		 * 
		 * 方法调用：方法名，实参必须严格匹配形参。
		 * 	方法名(实参);
		 * 
		 * 将实参赋值给形参的过程：参数的传递。简称：传参。
		 */
		// 1.求1-10的和
		getSum(10);//实参

		// 2.求1-20的和
		getSum(20);
		
		//3.求1-100的和
		getSum(100);
	}
	/**
	 * 方法用于求1-n的和。
	 * 参数：声明方法的时候，如果有些变量的数值，无法确定。就可以定义为参数。写在()内。
	 * 	数值由调用处传入。
	 * 
	 * 参数的本质：就是一个局部变量：声明和赋值分开了
	 * 
	 * @param n
	 */
	public static void getSum(int n) {//形参：用于接收外部传入的数据
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1-"+n+"的和：" + sum);
	}
}

