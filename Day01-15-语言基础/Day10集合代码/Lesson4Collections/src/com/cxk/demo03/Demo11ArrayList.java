package com.cxk.demo03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList实现类
 * 
 * @author hanru
 *
 */
public class Demo11ArrayList {
	public static void main(String[] args) {
		// 创建一个ArrayList集合
		ArrayList<String> list = new ArrayList<>();// 构造方法中的泛型可以省略
		list.add("zhangsan");// 向集合中添加元素
		list.add("lisi");
		list.add("wangwu");
		System.out.println(list.isEmpty());// 判断list集合是否为空集合
		System.out.println(list.size());// 查看集合中元素的个数
		System.out.println(list.get(1));// 获取集合中下标为1的元素
		System.out.println(list.set(1, "ruby"));// 修改集合中下标为1的元素
		System.out.println(list.contains("wangwu"));// 查看"wangwu"是否是集合中的元素
		list.remove("wangwu");// 删除集合中"wangwu"元素
		list.remove(1);// 删除集合中下标为1的元素
		// for循环遍历集合
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 使用Iterator迭代器遍历
		Iterator<String> it = list.iterator();// 获取迭代器
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}