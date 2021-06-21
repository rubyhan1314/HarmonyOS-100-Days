package com.cxk.demo03;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
/*
 * 接口A：
 * 	add()
 * 接口B：
 * 	addFirst()
 * 实现类C：implements A,B
 * 
 * A a = new C();//add()
 * B b = new C();//addFrist()
 * C c = new C();//add(),addFirst()..
 */
public class Demo12LinkedList {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		
		l1.add("aaa");
		l1.add(0, "bbb");//List
		System.out.println(l1);
		l1.addFirst("ccc");//向容器的开头，添加元素,Deque
		System.out.println(l1);
		l1.addLast("ddd");//向容器的末尾，添加元素,Deque
		System.out.println(l1);
		
		System.out.println(l1.element());//获取容器中的第一个元素，不删除
		System.out.println(l1);
		
		System.out.println(l1.getFirst());//效果同element()
		System.out.println(l1);
		
		System.out.println(l1.getLast());//获取最后一个元素
		System.out.println(l1);
		
		l1.offer("eee");//向容器后添加元素
		System.out.println(l1);
		
		System.out.println(l1.peek());//效果同element()
		System.out.println(l1);
		
		System.out.println(l1.poll());//获取容器中的第一个元素，并从容器中删除
		System.out.println(l1);
		
		System.out.println(l1.pop());//获取栈顶元素，并移出。
		System.out.println(l1);
		
		
	}

}
