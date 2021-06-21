package com.cxk.demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * finally语句
 * @author hanru
 *
 */
public class Demo03TryCatchFinally {
	public static void main(String[] args) {
		//读取本地一张图片的内容
		//1.指定要读取的图片的路径
		String imagePath = "D:\\Ruby\\pro\\aa.jpeg";
		//2.创建文件流，用于读取图片数据
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(imagePath);
			//3.读取图片数据，balabala。。。
			System.out.println("读取图片。。。。");
		} catch (FileNotFoundException e) {
			// 文件找不到异常，该异常是受检异常，必须处理
			e.printStackTrace();
		}finally {
			//4.关闭流，释放资源。
			//无论是否产生异常，此处的代码一定会被执行。
			System.out.println("释放资源。。");
			if(fileInputStream!= null){
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	}
}
