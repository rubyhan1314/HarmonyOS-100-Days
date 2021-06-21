package com.cxk.demo08;
/**
 * 鼠标，实现USB接口
 * @author hanru
 *
 */
public class Mouse implements USB{

	@Override
	public void start() {
		System.out.println("鼠标连入电脑，即将开始工作，可以点点点。。");
	}

	@Override
	public void stop() {
		System.out.println("鼠标结束工作，即将安全退出。。。");
	}

}
