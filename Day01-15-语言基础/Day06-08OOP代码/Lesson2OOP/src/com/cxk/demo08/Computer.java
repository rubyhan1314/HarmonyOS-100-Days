package com.cxk.demo08;
/**
 * 电脑类，提供一个功能方法，需要接口USB接口设备作为参数
 * @author hanru
 *
 */
public class Computer {
	
	//....
	
	//可以接收一个USB设备，
	//USb usb = mouse;
	public void plugIn(USB usb){//接口类型作为参数
		usb.start();//连入。。
		//........
		usb.stop();//安全退出。。
	}
	
	

	
	// ......
}
