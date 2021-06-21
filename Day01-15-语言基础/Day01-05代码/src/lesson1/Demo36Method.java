/*
* 方法
*/
public class Demo36Method {	
	/**
	 * main函数，不同于其他方法，是一个程序的唯一的入口。JVM自动执行main()方法中的内容。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//1.此处求1-10的和
		//step2:调用方法：方法名()
		getSum();//方法的调用处
		System.out.println("其他的代码。。。。10行。。。");
		//2.此处求1-10的和
		getSum();
		
		System.out.println("Hello world。。。");
		//3.求1-10的和
		getSum();
	}

	//step1：定义一个方法，也叫方法的声明
	/*
	 * ()，方法的标志
	 * []，数组
	 * <>，泛型
	 * {}，一段代码，一个类，一个方法，一个代码块
	 * 
	 * 方法名：小驼峰命名方式
	 * 注意点：方法声明的时候，方法里的代码不会被执行的。
	 */
	public static void getSum(){
		int sum = 0;
		for(int i = 1;i<=10;i++){
			sum += i;
		}
		System.out.println("1-10的和："+sum);
	}
}