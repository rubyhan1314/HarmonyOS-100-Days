package com.cxk.demo02;
class Container{
	String str = "";
	public Container add(String s){
		str += s;
		return this;//将当前的对象，作为返回值。
	}
}
public class Demo09StringBuffer {
	public static void main(String[] args) {
		/*
		 * 存储一个字符串，可以使用String，也可以使用StringBuffer，以及StringBuiler。
		 * String：字符串内容不能更改。
		 * StringBuffer：字符串的内容可以修改。
		 */
		
		//step1:创建StringBuffer对象。容量可以自动扩容
		StringBuffer sb = new StringBuffer();//，StringBuffer对象创建出来了，但是里面还没有内容
		System.out.println(sb.toString());
		
		StringBuffer sb2 = new StringBuffer(20);//StringBuffer创建了，容量存储20个字符。
		
		StringBuffer sb3 = new StringBuffer("abc");
		System.out.println(sb3.toString());
		
		
		
		
		Container c = new Container();
		c.add("haha").add("hehe").add("abc").add("程序咖");//方法链
		
		//step2：有哪些方法可以使用
		/*
		 * 1.添加
		 * append(String str)-->StringBuffer对象本身，在屁股后面追加。。
		 */
		System.out.println("sb-->"+sb);
		sb.append("abc");
		System.out.println(sb);
		sb.append(true);
		System.out.println(sb);
		sb.append(100).append(3.14).append(new Object());//方法链
		System.out.println(sb);//"abctrue1003.14java.lang.Object@15db9742"
		sb.append(sb);
		System.out.println(sb);
		
		/*
		 * insert(int offset, String str),在指定的位置，进行插入数据
		 */
		
		sb.insert(1, "XXX");
		System.out.println(sb);
		sb.insert(0, "***");
		System.out.println(sb);


		System.out.println(sb.length());//sb中存储的字符串的长度是84个
		sb.insert(84, "666");
		System.out.println(sb);
		
		
		/*
		 * 2.删除
		 * delete(int start, int end)-->StringBuffer
		 * 删除从start开始，到end结束，之间的这些字符
		 * [start，end)
		 * 
		 * StringBuffer deleteCharAt(int index)  
		 */
		sb.delete(1, 3);
		System.out.println(sb);
		sb.delete(0, 4);
		System.out.println(sb);
		
		sb.deleteCharAt(11);//删除指定的字符
		System.out.println(sb);
		
		/*
		 * 3.修改内容
		 * reverse()-->StringBuffer，翻转
		 */
		sb.reverse();
		System.out.println(sb);
		
		
		/*
		 * setCharAt(int index, char ch)-->void,使用第二个参数表示的字符，替换掉指定下标的字符
		 */
		sb.setCharAt(2, '9');
		System.out.println(sb);
		
		/*
		 * setLength(newLength)-->void，设置一个StringBuffer的字符串内容的长度
		 */
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.setLength(10);
		System.out.println(sb);
		sb.setLength(20);
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append("haha");
		System.out.println(sb);
		
		
		/*
		 * replace(int start, int end, String str)-->StringBuffer,
		 * 替换指定区间的内容，[stat,end),用str来替换
		 */
		sb.replace(10, 20, "XXX");
		System.out.println(sb);
		
		
		
		
		StringBuilder sb4 = new StringBuilder();
		sb2.append(true);
	}
}
