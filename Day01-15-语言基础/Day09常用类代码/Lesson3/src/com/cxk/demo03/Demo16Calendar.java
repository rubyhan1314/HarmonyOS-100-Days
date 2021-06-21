package com.cxk.demo03;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * 日历类
 * @author hanru
 *
 */
public class Demo16Calendar {

	public static void main(String[] args) {
		//step1:创建Calendar类的对象
		Calendar calendar = Calendar.getInstance();//newInstance方法是一个静态的方法，直接通过类名调用
//		System.out.println(calendar);
		
		//step2：获取所需要的数据
		/*
		 * 
		 * get(int field)	参数就是指定的属性，可以使用静态常量属性名代替int值
		 * year-->年
		 * month-->月，+1
		 * dayofmonth-->日期
		 * hourofday-->小时
		 * ....
		 */
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		System.out.println("MONTH: " + (calendar.get(Calendar.MONTH)+1));
		System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
//		System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));//0上午am，1下午pm
//		System.out.println("HOUR: " + calendar.get(Calendar.HOUR));//12小时制。
		System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));//24小时制
		System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));

		
		/*
		 * 通过Calendar类，可以直接获取年，月，日，时，分，秒。。。。
		 * Date类：
		 * 思考题：通过Calendar类的对象，获取当前的年月日时分秒：拼接成一个字符串：
		 *  2021年04月26日 11:52:33
		 */
		
		String date = calendar.get(Calendar.YEAR)+"年"+(calendar.get(Calendar.MONTH)+1)+"月"+calendar.get(Calendar.DAY_OF_MONTH)+"日";
		String time = calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND);
		System.out.println(date);
		System.out.println(time);
		System.out.println("-------------------");
		
		/*
		 * set(int field, int value) 第一个参数表示属性，第二个参数表示修改的值
		 */
		
		calendar.set(Calendar.DATE, 2215);
		System.out.println(calendar.get(Calendar.YEAR));
		
		
		/*
		 * getMaximum(int field)		获取属性的最大值
		 * getMinimum(int field)		获取属性的最小值
		 */

		int max = calendar.getMaximum(Calendar.DATE);//获取日期的最大值,无论calendar表示几月份,max的值都是31
		int min = calendar.getMinimum(Calendar.DATE);//获取日期的最小值,无论calendar表示几月份,min的值都是1
		System.out.println(max);
		System.out.println(min);
		
		/*
		 * getActualMaximum(int field)	获取指定日历的指定属性的最大值
		 * getActualMinimum(int field)	获取指定日历的指定属性的最小值
		 */

		int max2 = calendar.getActualMaximum(Calendar.DATE);
		//若calendar表示的1月，则max值为31；若calendar表示的4月，则max值为30；
		int min2 = calendar.getActualMinimum(Calendar.DATE);//无论c表示几月份，min值都是1
		System.out.println(max2);
		System.out.println(min2);
	}

}
