public class Demo07TranserSign 
{
	public static void main(String[] args) 
	{
		/*
		转义字符：将字符进行转义-->语法上使用\
			1、将有特殊作用的字符，转为普通的字符，不再起作用
				\',\",\\
			2、还可以将一些普通的字符，转为有特殊含义的作用
				\n,\t
		*/

		char c = '\'';//'
		System.out.println(c);
		char c2 = '"';//"
		System.out.println(c2);

		System.out.println("Hello\nWor\tld");
		System.out.println("D:\\Ruby\\程序咖");//路径
		System.out.println("\"HelloWorld\"");//打印带双引号的helloworld
	}
}
