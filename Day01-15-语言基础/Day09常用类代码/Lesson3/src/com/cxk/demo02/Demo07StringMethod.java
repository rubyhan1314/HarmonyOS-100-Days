package com.cxk.demo02;

import java.util.Arrays;

public class Demo07StringMethod {

	public static void main(String[] args) {
		String s1 = "helloWorld";//10个字符
		
		/*
		 * 1.int length()          返回此字符串的长度。 
		 */
		int len = s1.length();//获取字符串s1的长度
		System.out.println("字符串长度："+len);
		System.out.println("--------------------------");
		
		/*
		 * 2.char charAt(int index)           返回指定索引处的 char 值。
		 * 根据指定的下标获取对应的字符。要注意越界问题。StringIndexOutOfBoundsException。
		 * index的取值：从0开始，到长度减1。
		 */
		char c = s1.charAt(6);
		System.out.println("下标6对应的字符："+c);
		System.out.println("--------------------------");
		
		/*
		 * 3.查找指定的字符或字符串
		 * indexOf(int 字符)-->index，在字符串中，查找指定的参数的字符，返回值是该字符在字符串中第一次出现的下标。如果没有该字符，返回-1。
		 * 
		 * indexOf(String 子串)-->index，同上
		 * 
		 * indexOf(int 字符，int fromIndex)-->index，表示在字符串中，从fromIndex下标开始向后找指定的字符，如果有就返回下标，如果没有就-1。
		 * 
		 * indexOf(String 子串，int fromIndex)-->同上
		 * 
		 * lastIndexOf(int 字符)-->index，在指定的字符串中，搜索该字符，最后一次出现的位置。理解为倒着搜。
		 * 
		 * lastIndexOf(String 子串)，同上
		 * 
		 * lastIndexOf(int 字符，int fromIndex)-->index，在字符串中查找指定的内容，从fromIndex，从后往前，倒着搜，第一次出现的位置。
		 * 
		 * lastIndexOf(String ,int fromIndex)
		 */

		/*
		 int indexOf(int ch)   
        		返回指定字符在此字符串中第一次出现处的索引。 
		 int indexOf(int ch, int fromIndex) 
        		返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。 
		 int indexOf(String str)	  
        		返回指定子字符串在此字符串中第一次出现处的索引。 
		 int indexOf(String str, int fromIndex) 
         		返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。 
		*/
		int index1 = s1.indexOf('g');//获取'g'字符在s1字符串中第一次出现的索引

		//注意：返回的是在源字符串中的索引
		int index2 = s1.indexOf('g',4);//获取'g'字符在s1字符串中从索引为4开始第一次出现的索引

		//注意：查找字符串时，返回的是第一个字母的下标
		int index3 = s1.indexOf("abc");//获取"abc"字符串在s1字符串中第一次出现的索引

		//注意：查询没有结果时则返回-1
		int index4 = s1.indexOf("abc",4);//获取"abc"字符串在s1字符串中从索引为4开始第一次出现的索引
		
		
		/*
		 * 4.从后向前查找
		int lastIndexOf(int ch) 
          	返回指定字符在此字符串中最后一次出现处的索引。 
		int lastIndexOf(int ch, int fromIndex) 
          	返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。 
		int lastIndexOf(String str) 
          	返回指定子字符串在此字符串中最右边出现处的索引。 
		int lastIndexOf(String str, int fromIndex) 
          	返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。 
		*/

		//注意：从左往右进行查询，获取到的索引仍然是在原字符串中的索引
		int index5 = s1.lastIndexOf('g');//获取'g'字符在s1字符串中最后一次出现的位置

		
		int index6 = s1.lastIndexOf('l', 4);
		
		/*
		 * 5.boolean contains(CharSequence s)    当且仅当此字符串包含指定的 char 值序列时，返回 true。
		 * contains()-->boolean判断字符串中，是否包含了指定的内容。返回值是boolean，true，false。
		 */
		//注意：判断包含的内容必须是连续的
		boolean b1 = s1.contains("hello");//判断s1字符串是否包含"hello"字符串
		System.out.println(b1);
		System.out.println("--------------------------");
		
		/*
		 * 6.boolean isEmpty()           当且仅当 length() 为 0 时返回 true。 
		 */
		boolean b2 = s1.isEmpty();//判断s1字符串是否是空字符串
		System.out.println("--------------------------");
		
		
		
		/*
		 * 7.boolean startsWith(String prefix)           测试此字符串是否以指定的前缀开始。 
		 * 
		 * 注意：区分startsWith和contains
		 */
		String s2 = "20210425记录.txt";
		if(s2.startsWith("202104")){
			System.out.println("是今年4月份的记录文件。。");
		}
		
		
		/*
		 * 8.boolean endsWith(String suffix)  测试此字符串是否以指定的后缀结束。 
		 */
		String s3 = "aa.jpeg";
		if(s3.endsWith(".jpeg")){
			System.out.println(s3+"，是一张图片。。");
		}
		System.out.println("--------------------------");
		

		/*
		 * 9.boolean equals(Object anObject)           将此字符串与指定的对象比较。 
		 * -->boolean,比较两个字符串的内容是否相等。""引起来的内容是否一致
		 */
		String str1 = "hello world";
		boolean b3 = s1.equals(str1);//判断str1是否与s相同
		
		/*
		 * 10.boolean equalsIgnoreCase(String anotherString) 
		 * 将此 String 与另一个 String 比较，不考虑大小写。 
		 * 
		 */
		boolean b4 = "Abc".equalsIgnoreCase("abc");//true
		boolean b5 = "Abc".equals("abc");//false
		System.out.println("--------------------------");
		
		/*
		 * 11. 替换
		 * 
		 * String replace(char oldChar, char newChar)  
		 * 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 
		 * 
		 * String replace(CharSequence target, CharSequence replacement) 
		 * 使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。 
		 */


		String s4 = "hello程序咖Java程序咖Java程序咖Ruby";
		//注意：会替换原字符串中所有的指定字符
		String s5 = s4.replace('a','*');
		System.out.println(s5);

		//注意：将要替换的字符串可以和被替换的字符串长度不相等，当做一个整体被替换掉
		String s6 = s4.replace("Java","Golang");
		System.out.println(s6);
		System.out.println("--------------------------");

		
		/*
		 * 12.字符串的截取
		 * String substring(int beginIndex)，返回一个新的字符串，它是此字符串的一个子字符串。 
		 * 从参数表示的下标开始，截取到末尾。
		 * 
		 * String substring(int beginIndex, int endIndex) ，返回一个新字符串，它是此字符串的一个子字符串。 
		 *
		 */
		//s = "helloWorld";//10个字符
		//从指定的下标开始截取后半部分
		String s7 = s1.substring(5); ///World
		System.out.println(s1);
		System.out.println(s7);
		
		//包头不包尾：截取指定区间的子字符串
		String s8 = s1.substring(2, 6);//lloW,包含下标2，不包含6之间的字符
		System.out.println(s8);
		System.out.println("--------------------------");
		
		/*
		 * 13.忽略首尾空格
		 * String trim() ，返回字符串的副本，忽略前导空白和尾部空白。 
		 */
		
		String s9 = "  hello world ";//前2个空格，中间1个，末尾1个
		System.out.println(s9.length());
		String s10 = s9.trim();
		System.out.println(s10.length());
		
		System.out.println("--------------------------");
		
		/*
		 * 14.格式化
		 * static String format(String format, Object... args) 
		 *  使用指定的格式字符串和参数返回一个格式化字符串。 
		 *  %f   	float，可以保留小数点后几位
		 *  %d	 	整型
		 *  %s	 	字符串
		 *  %c	 	char
		 *  %b		boolean
		 */
		

		String s11 = String.format("%.2f--%b--%s",10.23766f,true,"hello");
		System.out.println(s11);
		System.out.println("hello" + 10.23766f + true);
		System.out.println("--------------------------");

		
		
		/*
		 * 15.比较
		 * int compareTo(String anotherString) 按字典顺序比较两个字符串。 
		 * int compareToIgnoreCase(String str)  按字典顺序比较两个字符串，不考虑大小写。 
		 */
		/*
		如果按字典顺序此 String 对象位于参数字符串之前，则比较结果为一个负整数。
		如果按字典顺序此 String 对象位于参数字符串之后，则比较结果为一个正整数。
		如果这两个字符串相等，则结果为 0
		*/
		int num1 = "abc".compareTo("def");
		System.out.println(num1);//-3

		int num2 = "def".compareTo("abc");
		System.out.println(num2);//3

		int num3 = "abc".compareTo("abc");
		System.out.println(num3);
		System.out.println("--------------------------");
		
		/*
		 * 16.字符串拼接
		 * String concat(String str)，将指定字符串连接到此字符串的结尾。 
		 * 字符串的拼接。效果同+起连接符作用一样的。返回一个拼接之后的新的字符串
		 */
		//注意：在String类中，但凡返回值是String类型的方法，生成的都是一个新的字符串，跟原来的字符串没有关系
		String s12 = s1.concat("***");
		System.out.println(s12);
		System.out.println("--------------------------");
		
		
		
		/*
		 * 17.字符串切割
		 * split(分隔符)-->String[] ，按照指定的内容，将字符串进行分离(切割)，得到一个数组。
		 * 注意点：分隔符，在开头，在中间，都起作用的。在末尾不起作用。
		 * 
		 */
		

		String s13 = "鹅鹅a鹅,曲项,,向a天歌,拔毛加漂水,点火盖上锅,,,,,,,,,,";//""
		System.out.println(s13);
		
		String[] arr = s13.split(",");
		System.out.println("--->"+arr.length);
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("--------------------------");
		/*
		 * 18.转换大小写
		 * toLowerCase()，
		 * toUpperCase()，
		 * 
		 */
		String s14  ="aBcD123**";
		System.out.println(s14.toLowerCase());//abcd123**
		System.out.println(s14.toUpperCase());//ABCD123**
		
		System.out.println("--------------------------");
		
		
		/*
		 * 19.转为数组
		 * getBytes()-->byte[]根据字符串，获取对应的字节数组。
		 * toCharArray()-->char[] 
		 */
		//s = "helloWorld";//10个字符
		byte[] bytes = s1.getBytes();
		System.out.println(Arrays.toString(bytes));
		
		char[] array = s1.toCharArray();
		System.out.println(Arrays.toString(array));
		

		
		
	
		
		
		
		

		
	}

}
