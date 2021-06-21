public class Demo28LocalVar {

	public static void main(String[] args) {
		/*
		 * 变量：
		 * 	概念：
		 * 	三要素：数据类型，变量名，数据
		 * 
		 * 分类：
		 * 	按照数据类型划分：基本数据类型变量，引用数据类型变量
		 * 	按照地理位置划分：
		 * 
		 * 		局部变量：方法里定义的变量就叫局部变量。作用域。
		 * 			{}表示一个作用域，在哪个{}内声明的变量，就在哪个{}内使用。
		 * 
		 * 		作用域：可以使用的范围。{}
		 */
		
		int num = 10;//主函数中定义的，局部变量。
		System.out.println(num);
		
		
		if(num > 0){
			int num2 = 20;//局部变量
			System.out.println(num2);
			System.out.println(num);
		}
//		System.out.println(num2);//报错的，超出了作用域
	}
}

