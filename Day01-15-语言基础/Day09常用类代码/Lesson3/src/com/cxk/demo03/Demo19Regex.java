package com.cxk.demo03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo19Regex {

	public static void main(String[] args) {
		// 通过某一个规则，验证文本字符串是否满足该规则
		// step1：提供规则对象：Pattern类
		Pattern p1 = Pattern.compile("规则");
		// step2：获取匹配器对象，用于验证
		Matcher matcher = p1.matcher("要被验证的字符文本");
		// step3：验证：boolean
		boolean b1 = matcher.matches();

		Pattern p = Pattern.compile("[0-9]");// 规则
		Matcher m = p.matcher("ab");// 获取验证器
		boolean b = m.matches();// 验证，得到结果
		// System.out.println(b);

		// 1.String类的matchers(),验证给定的文本是否满足规则
		// 验证QQ号,全数字，最少5位，最多11位。首位不能是0
		String s2 = "79539705a";
		boolean b2 = s2.matches("[1-9]\\d{4,10}");
		System.out.println(b2);

		String s3 = "1900-09-12";
		boolean b3 = s3.matches("\\d{4}-\\d{2}-\\d{2}");
		System.out.println(b3);
		// 1：验证手机号：位数：11位。首位必须1，第二位：34578，其余9位任意数字
		String s4 = "13212344321";
		boolean b4 = s4.matches("1[34578]\\d{9}");
		System.out.println(b4);
		// 2：验证身份证号：18位数字，首位非0，最后一位：0-9,或X
		String s5 = "21032319931217132X";
		boolean b5 = s5.matches("[1-9]\\d{16}[\\d|X]");
		System.out.println(b5);
		// 3：验证用户名：字母，数字，_，组成，位数：至少5位，最多12位。首位必须大写
		String s6 = "Wang_521";
		boolean b6 = s6.matches("[A-Z]\\w{4,11}");
		System.out.println(b6);

		// 2.replaceAll()
		// 将所有的数字替换为*
		String s7 = "ddfjjf729394fnvfk0084nfnmjrkfj18374mffjf";
		String ss7 = s7.replaceAll("\\d", "*");
		System.out.println(ss7);

		String ss8 = s7.replaceAll("\\d+", "*");
		System.out.println(ss8);

		// 小写字母替换为X
		String ss9 = s7.replaceAll("[a-z]+", "X");
		System.out.println(ss9);

		// 3.split(),切割
		String s8 = "12 998899    98848 0939  48";
		String[] ss = s8.split(" +");
		for (int i = 0; i < ss.length; i++) {
			System.out.println("-->" + ss[i]);
		}

		String s9 = "dkfjfj13494fkfjfkkgk39495kfkjgj5586896jgjgjgj595";
		String[] ss2 = s9.split("\\d+");
		for (int i = 0; i < ss2.length; i++) {
			System.out.println(ss2[i]);
		}

		String s10 = "中国";
		boolean b10 = s10.matches("[\u4e00-\u9fa5]+");
		System.out.println(b10);

	}

}
