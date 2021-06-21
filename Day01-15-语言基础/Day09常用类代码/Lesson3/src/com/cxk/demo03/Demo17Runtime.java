package com.cxk.demo03;

import java.io.IOException;
/**
 * Runtime类
 * @author hanru
 *
 */
public class Demo17Runtime {

	public static void main(String[] args) {
//		Runtime runtime = new Runtime();
		Runtime runtime = Runtime.getRuntime();//获取JVM正在执行程序，看成实例。
		System.out.println(runtime.maxMemory());//获取JVM试图使用的最大内存，字节
		System.out.println(runtime.freeMemory());//剩余内存大小
		runtime.gc();
		try {
			//C:\ProgramData\Microsoft\Windows\Start Menu\Programs\腾讯软件\QQ
			runtime.exec("C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQ.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
