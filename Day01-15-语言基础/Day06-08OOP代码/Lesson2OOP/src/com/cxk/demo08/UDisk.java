package com.cxk.demo08;
/**
 * 优盘：USB flash disk
 * 
 * 也实现USB接口
 * @author hanru
 *
 */
public class UDisk implements USB{

	@Override
	public void start() {
		System.out.println("U盘连入电脑，即将开始工作，复制500张照片。。");
	}

	@Override
	public void stop() {
		System.out.println("U盘导出数据结束，即将安全退出。。。");
	}

}
