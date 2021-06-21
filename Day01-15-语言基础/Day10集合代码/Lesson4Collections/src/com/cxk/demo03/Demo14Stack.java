package com.cxk.demo03;

import java.util.Stack;
/**
 * 栈
 * @author hanru
 *
 */
public class Demo14Stack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("程序咖");//入栈，压栈
		stack.push("Ruby");
		stack.push("王二狗");
		System.out.println(stack);
		System.out.println(stack.pop());//弹栈，出栈
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
