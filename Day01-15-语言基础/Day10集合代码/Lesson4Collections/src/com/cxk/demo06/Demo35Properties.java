package com.cxk.demo06;

import java.util.Properties;

public class Demo35Properties {

	public static void main(String[] args) {
		/*
		 * Map
		 * HashTable
		 * Properties
		 * 看系统的配置信息：演示效果
		 * 
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println();
		 */
		//1.通过System类，获取系统的一些属性信息，在Properties集合中
		Properties properties = System.getProperties();
//		System.out.println(properties);
		//2.显示到屏幕上
		properties.list(System.out);//System.out-->PrintStrem(打印流)，属于IO范畴的，现在超纲
	}

}
