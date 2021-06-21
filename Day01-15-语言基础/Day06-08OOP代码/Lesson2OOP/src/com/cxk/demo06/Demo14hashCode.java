package com.cxk.demo06;

public class Demo14hashCode {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();//李老师
		Teacher t2 = new Teacher();
		//哈希码：计算机产生，理论上为每个对象计算出一个哈希值。10进制的整数值。
		System.out.println(t1.hashCode());//哈希值就是对象的一个"数字型"的名字
		System.out.println(t2.hashCode());
		System.out.println(new Teacher().hashCode());
		
	}

}
class Teacher{
	
}
