package com.cxk.demo08;

/**
 * 定义USB接口，就是定义有哪些功能，规则
 * @author hanru
 *
 */
public interface USB {
	//表示USB设备可以连入，开始工作。。
	public void start();
	
	//表示USB设备，可以安全退出。。
	public void stop();
}
