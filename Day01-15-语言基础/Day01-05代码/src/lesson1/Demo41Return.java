
//程序咖
public class Demo41Return {

	public static void main(String[] args) {
		
		/*
		 * 一个方法的返回值：一个方法执行之后的结果，返回给调用处。
		 * 声明方法的时候：标注清楚该方法的返回值类型，如果没有返回值就写void。
		 */
		// 在main中获取1-10的和结果，放大10倍，打印
		int res = getSum();//相当于int res = sum
		System.out.println(res * 10);
	}

	/**
	 * 一个方法如果有返回值，那么声明的时候要写清楚返回值类型，只能写一个。
	 * 如果没有返回值，就写void
	 * 方法中必须使用return语句返回这个结果。
	 * @return
	 */
	public static int getSum() {//This method must return a result of type int
		int sum = 0;// 局部变量，只能在该方法中使用
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
//		System.out.println(sum);//55
		return sum;//将sum的值，传递给方法的调用处
	}

}

