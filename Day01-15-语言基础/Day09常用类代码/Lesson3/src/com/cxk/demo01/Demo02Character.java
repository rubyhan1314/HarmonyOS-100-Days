package com.cxk.demo01;

public class Demo02Character {

	public static void main(String[] args) {
		System.out.println("最大值："+(int)Character.MAX_VALUE);//65535
		System.out.println("最小值："+(int)Character.MIN_VALUE);//0
		
		//构建一个包装类的对象
		Character c1 = new Character('a');//对象
		char c2 = '*';//基本类型
		
		//判断给定的字符，是否是数字：0-9
		System.out.println(Character.isDigit(c2));//boolean
		//判断给定的字符，是否是字母[a-zA-Z]
		System.out.println(Character.isLetter(c2));//boolean
		
		//判断是否是小写字母
		System.out.println(Character.isLowerCase('A'));//false
		//判断是否是大写字母
		System.out.println(Character.isUpperCase('A'));//true
		
		
		//将大写字母，转为小写字母
		System.out.println(Character.toLowerCase('A'));
		//将小写字母，转为大写字母
		System.out.println(Character.toUpperCase('*'));
	}

}
