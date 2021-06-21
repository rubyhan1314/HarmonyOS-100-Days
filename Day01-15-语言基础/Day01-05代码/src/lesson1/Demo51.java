class Demo51 
{
	public static void main(String[] args) 
	{
		getNum(100);
		getNum1(10);
      	exchange();
	}

	//1.求1--某个数之间可以被7整除的数的个数
	public static int getNum(int n) {
		int count = 0;
		for(int i = 1;i <= n;i++) {
			if(i % 7 == 0) {
				count++;
			}
		}
		return count;
	}

	//2.计算1到某个数以内能被7或者3整除但不能同时被这两者整除的数的个数。
	public static int getNum1(int n) {
		//&&
		int count = 0;
		for(int i = 1;i <= n;i++) {
			if((i % 7 == 0 || i % 3 == 0) && i % 21 != 0) {
				count++;
			}
		}

		//嵌套if语句
		int count1 = 0;
		for(int i = 1;i <= n;i++) {
			if(i % 7 == 0 || i % 3 == 0) {
				if(i % 21 != 0) {
					count1++;
				}
			}
		}
		return count;
	}

	//3.从键盘输入两个数，赋值给两个变量，交换这两个变量的值【三种方法】
	public static void exchange() {
		int a = 10;
		int b = 20;

		//方式一：异或【面试题：不采用第三方变量，交换两个变量的值】
		a = a ^ b;   //10 ^ 20
		b = a ^ b;	 //10 ^ 20 ^ 20 = 10
		a = a ^ b;   //10 ^ 20 ^　１０　＝　２０

		//方式二：加法
		int c = a  + b;//30
		a = c - a;//30 - 10 =20
		b = c - a; //30 - 20 = 10

		a = a  + b;
		b = a - b;//10
		a = a - b;//20

		//方式三：
		int temp = a;
		a = b;
		b = temp;
	}
}