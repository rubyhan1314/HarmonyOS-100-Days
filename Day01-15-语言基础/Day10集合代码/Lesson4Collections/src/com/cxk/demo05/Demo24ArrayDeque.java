package com.cxk.demo05;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo24ArrayDeque {
	public static void main(String[] args) {
		// 创建一个Deque
		Deque<String> deque = new ArrayDeque<String>();
		// add()，添加元素
		deque.add("程序咖");
		deque.add("Ruby");
		deque.add("王二狗");
		// 遍历
		for (String str : deque) {
			System.out.println(str);
		}
		System.out.println("--------------------");
		// offer()
		deque.offer("李小花");
		deque.offer("Java语言");
		deque.offer("php");
		for (String s : deque) {
			System.out.println(s);
		}
		System.out.println("---------------");
		// deque.poll();
		System.out.println("获取队头："+deque.pollFirst());
		System.out.println(deque);
		System.out.println("获取队尾："+deque.pollLast());
		System.out.println(deque);
	}
}