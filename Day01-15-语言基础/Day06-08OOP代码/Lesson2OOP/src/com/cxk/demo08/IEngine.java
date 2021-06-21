package com.cxk.demo08;
/**
 * 定义一个发动机接口：规定，3个功能
 * @author hanru
 *
 */
public interface IEngine {
	//发动机能够启动
	public void start();
	//发动机能够停止
	public void stop();
	//发动机加速
	public void speedUp();
}
