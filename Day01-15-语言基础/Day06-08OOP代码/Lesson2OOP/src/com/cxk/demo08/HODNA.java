package com.cxk.demo08;
/**
 * hodna实现了发动机接口
 * @author hanru
 *
 */
public class HODNA implements IEngine{

	@Override
	public void start() {
		System.out.println("HODNA启动，速度40.。。");
	}

	@Override
	public void stop() {
		System.out.println("HODNA停止，速度0.。。");
	}

	@Override
	public void speedUp() {
		System.out.println("HODNA加速，速度120.。。");
	}

}
