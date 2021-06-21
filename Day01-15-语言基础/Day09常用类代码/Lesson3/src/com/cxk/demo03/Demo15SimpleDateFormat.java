package com.cxk.demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 日期-文本之间的格式化
 * @author hanru
 *
 */
public class Demo15SimpleDateFormat {

	public static void main(String[] args)  {
		Date date = new Date();
		System.out.println(date.toString());//Mon Apr 26 14:07:21 IRKT 2021
		
		
		/*
		 * 模板：
		 * 2021-04-26-->"yyyy-MM-dd"
		 * 2021/04/26  --> "yyyy/MM/dd"
		 * 2021年04月26日："yyyy年MM月dd日"
		 * 2021-04-26 11:01:33-->"yyyy-MM-dd HH:mm:ss"
		 * ....
		 */
		
		/*
		 * SimpleDateFormat类：
		 * Date-->String：日期格式化？就是将一个日期Date对象，按照指定的字符串格式去显示。
		 * 		format(Date date),根据模板，将date日期，转为String字符串类型
		 * 		
		 * 		Date-->String：日期格式化？就是将一个日期Date对象，按照指定的字符串格式去显示。
		 * 
		 * 		1.创建SimpleDateFormat对象。可以通过构造方法指定模板(格式)："yyyy-MM-dd"
		 * 			如果没有指定模板，使用系统默认：20-4-16 上午11:09
		 * 		2.sdf.format(date)-->String
		 * 
		 * 
		 */
		//step1：创建格式化对象：
		SimpleDateFormat sdf = new SimpleDateFormat();//默认格式：yy-M-dd 
		
		//step2:调用format方法，将date--->String
		String s1 = sdf.format(date);
		System.out.println(s1);//21-4-26 下午2:07
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss.SSS");
		String s2 = sdf2.format(date);
		System.out.println(s2);//2021年04月26日 14:07:21.356
		
		
		
		/*
		 * String-->Date：解析？就是将一个文本字符串，解析成一个Date对象。
		 * 		parse(String str)，根据模板，将字符串解析为对应的日期对象，异常。
		 * 		1.同上
		 * 		2.sdf.parse(String)-->date
		*/
		//String类型的表示日期的数据--->Date对象
		String src = "2021-05-22";
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		Date date2;
		try {
			date2 = sdf3.parse(src);//会按照sdf对应的模板来进行格式化
			System.out.println(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
