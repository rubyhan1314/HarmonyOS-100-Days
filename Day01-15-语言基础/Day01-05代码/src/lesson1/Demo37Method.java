public class Demo37Method 
{

	public static void getSum(){
		//求1-100的和
		int sum = 0;
		for(int i = 1;i <= 100;i++){
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void printTriangle(){
		for(int i = 0;i<5;i++){
			for(int j = 0;j <= i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		/*
练习1：声明一个方法：有static关键字。用于求1-100的和。将结果在方法中打印。主函数中调用该方法2次。

练习2：声明一个方法：没有static关键字。用于打印一个三角形。主函数中调用该方法3次。
*/
		getSum();
		getSum();
		
		Demo56 d = new Demo56();
		d.printTriangle();
		d.printTriangle();
		d.printTriangle();
	}
}

