package com.cxk.demo03;
import java.util.Vector;
import java.util.Enumeration;
/**
 * Vector旧的类：jdk1.0，线程安全，效率低。被ArrayList替代了
 * 底层实现，都是数组的结构
 * 
 * Vector直接的子类：Stack，功能被LinkedList替代：push(),pop()
 * @author hanru
 *
 */
public class Demo13Vector{
	public static void main(String[] args){
		Vector<String> v = new Vector<String>();
		v.add("向量");
		v.add("123");
		v.add("abc");
		v.add("程序咖");
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			System.out.println("---" + e.nextElement());
		}
	}
}
