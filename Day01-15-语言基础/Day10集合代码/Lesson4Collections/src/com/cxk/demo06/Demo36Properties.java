package com.cxk.demo06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class Demo36Properties {

	public static void main(String[] args) throws Exception {
		//默认泛型：String类型
		Properties properties = new Properties();
		//向集合中存储一些属性信息
		System.out.println(properties);
//		properties.put("name", "zhangsan");
		properties.setProperty("username", "Ruby");//用户名这个属性
		properties.setProperty("password", "chengxuka123456");
		System.out.println(properties);
		/*
		 * 支持持久化存储：
		 * 		瞬时存储：内存中，存储的数据，都叫瞬时数据。当程序结束的时候，对象，变量，常量。。。从内存中销毁，释放内存。
		 * 		持久存储：程序关闭，电脑关机等，数据还在。数据库，本地文件。
		 */
		
		//将Properties中的属性信息持久化存储――>存储到文件。
		//从此行开始，代码超纲：听思路，代码看懂注释
		
		//step1.创建一个文件对象File类的对象，表示C盘Ruby目录下的message.properties文件
		File file = new File("D:\\message.properties");
		
		//step2：创建文件输出流，用于将数据写入到file文件中
		FileOutputStream fos = new FileOutputStream(file);
		
		//step3：将properties里面的属性信息，存储到file文件里
		properties.store(fos, "mymessage");
		System.out.println("信息保存完毕。。。");
	}

}
