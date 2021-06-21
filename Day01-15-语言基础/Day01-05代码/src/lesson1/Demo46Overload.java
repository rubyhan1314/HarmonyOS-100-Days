//演示方法的重载
//测试类
public class Demo46Overload 
{
	public static void main(String[] args) 
	{
		//对于重载函数而言，具体调用的是哪个函数，取决于所传的参数
		Check.show("10");
		Check.show("10",10);
	}
}
//实体类
/*
在同一个类中，如果满足以下的条件，则称为这几个方法之间彼此重载
		a.方法名相同
		b.参数不同【数量不同或者类型不同】
		c.访问权限修饰符和返回值类型没有影响
*/
class Check
{
	public static void show() {
		System.out.println("无参无返回值的show");
	}

	//1.改变参数
	public static void show(int a) {
		System.out.println("int的show");
	}

	public static void show(String a) {
		System.out.println("String的show");
	}

	public static void show(String a,int b) {
		System.out.println("String  int的show");
	}

	//2.改变返回值:返回值对方法的重载没有任何影响
	//只改变返回值类型，其他都不改变，则对于编译器而言，则认为是同一个方法
	/*
	public static String show() {
		System.out.println("String返回值的show");

		return "abc";
	}
	*/

	//3.访问权限修饰符
	//只改变访问权限修饰符，其他都不改变，则对于编译器而言，则认为是同一个方法
	/*
	static void show() {
		System.out.println("show");
	}
	*/
}