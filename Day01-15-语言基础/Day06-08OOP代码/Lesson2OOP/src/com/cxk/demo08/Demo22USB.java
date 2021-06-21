package com.cxk.demo08;

public class Demo22USB {

	public static void main(String[] args) {
		Computer pc = new Computer();
		
		//接口类型的引用，指向实现类的对象
		USB usb = new Mouse();//向上转型
		
		Mouse mouse = new Mouse();
		pc.plugIn(mouse);
		
		
		USB usb2  =new UDisk();//向上转型
		pc.plugIn(usb2);
	}

}
