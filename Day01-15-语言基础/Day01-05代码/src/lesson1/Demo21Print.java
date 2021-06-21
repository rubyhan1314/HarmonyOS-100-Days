public class Demo21Print 
{
	public static void main(String[] args) 
	{
		/*
		打印：System.out.xxxx()
		1、println();print + line ，打印后换行

		2、print();只是打印，不换行

		3、扩展内容：
			printf();print+format ，格式化打印
		*/

		System.out.println("Hello World!");//print + line ，打印后换行
		System.out.println("程序咖！");
		System.out.println();//只是换行
		System.out.println("王二狗");
		System.out.print("李小花");
		System.out.print("刘铁柱");

		System.out.println();

		String name = "妖刀姬";
		int age = 100;
		double score = 88.7;


		System.out.printf("姓名：%s，年龄：%d 岁，分数：%.2f\n",name,age,score);//占位符，使用一个符号，占着这个地儿
		System.out.println("main..over..");
	}
}
