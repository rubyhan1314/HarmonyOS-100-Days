public class Demo06Char 
{
	public static void main(String[] args) 
	{
		//字符类型：char，使用单引号引起来
		char c = 'A';
		System.out.println(c);

		//使用编码值进行存储
		char c2 = 65;//65是字符A的编码值
		System.out.println(c2);

		//采用unicode编码：16进制赋值
		char c3 = '\u0041';
		System.out.println(c3);

		char c4 = '中';
		System.out.println(c4);
		System.out.println((int)c4);//将c4这个字符按照数值打印：其实就是该字符的编码值

		char c5 = 20013;
		System.out.println(c5);//中

		char c6 = '国';//22269
		System.out.println((int)c6);

		char c7 = 22269;
		System.out.println(c7);
	}
}

