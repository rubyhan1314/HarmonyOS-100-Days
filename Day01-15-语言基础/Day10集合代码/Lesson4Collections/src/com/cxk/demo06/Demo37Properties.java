package com.cxk.demo06;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Demo37Properties {

	public static void main(String[] args) throws Exception {
		//1.step1：创建文件对象，表示存储了数据的本地文件：D盘，message.properties
		File file = new File("D:\\message.properties");
		
		//2.创建集合Properties，用于存储从文件中读来的数据
		Properties properties2 = new Properties();
		System.out.println(properties2);//{}
		
		
		//3.从文件上创建输入流，用于读取文件中的数据
		FileInputStream fis = new FileInputStream(file);
		
		//4.将file中的数据，到properties集合中
		properties2.load(fis);
		
		System.out.println(properties2);
	}

}
