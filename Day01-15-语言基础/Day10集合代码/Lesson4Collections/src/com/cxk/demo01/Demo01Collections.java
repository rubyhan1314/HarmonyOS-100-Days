package com.cxk.demo01;

import java.util.ArrayList;
import java.util.Collection;
/**
 * Collection接口：
 * @author hanru
 *
 */
public class Demo01Collections {

	public static void main(String[] args) {
		//step1：创建一个集合容器，Collection是接口类型，需要创建它的实现类对象。
		Collection c1 = new ArrayList();
		System.out.println(c1);
		System.out.println(c1.size());//0
		
		//step2：操作这个集合容器
		//1.向容器中，添加一个元素
		c1.add("abc");//String-->Object
		System.out.println(c1.size());//1
		c1.add("hello");
		c1.add(100);//int-->Integer-->Object
		//2.打印容器的时候，直接显示容器中存储的元素数据
		System.out.println(c1);//[abc, hello, 100]
		//3.集合的长度：集合中存储的元素的个数
		System.out.println(c1.size());//3

		//4.删除集合中的元素
		c1.remove("abc");
		System.out.println(c1);//[hello, 100]
		System.out.println(c1.size());//2
		
		//5.是否包含指定的内容：
		System.out.println(c1.contains("hello"));//true
		
		
		//6.清空集合
		c1.clear();
		System.out.println(c1);//[]
		System.out.println(c1.size());//0
		System.out.println("c1是空的。。"+c1.isEmpty());
		c1.add("hello");
		c1.add("world");
		System.out.println("c1是空的。。"+c1.isEmpty());
		
		
		
		
		Collection c2 = new ArrayList();
		c2.add("aaa");
		c2.add("bbb");
		c2.add("ccc");
		
		System.out.println(c1);
		System.out.println(c2);
		
		//7.将c2容器中的所有元素，都添加到c1中。
		c1.addAll(c2);
		System.out.println(c1);//[hello, world, aaa, bbb, ccc]
		System.out.println(c2);//[aaa, bbb, ccc]
		//8.从c1中删除所有c2的元素
//		c1.removeAll(c2);
//		System.out.println(c1);//[hello, world]
//		System.out.println(c2);//[aaa, bbb, ccc]
		
		
		c1.add(100);
		c1.add("haha");
		System.out.println(c1);//[hello, world, aaa, bbb, ccc, 100, haha]
		//9.retainAll();对于c1容器来讲，仅保留和c2容器相同的数据。不同的其他的元素，删除。
		c1.retainAll(c2);
		System.out.println(c1); //[aaa, bbb, ccc]
		System.out.println(c2); //[aaa, bbb, ccc]
		
		//如何遍历集合中的所有的元素？迭代器Iterator
		/*
		 * 数组的遍历：
		 * 	普通for循环，下标
		 * 	for-each，增强for循环，不需要操作下标。。
		 * for(数据类型 变量名: 数组/集合){
		 * }
		 */
		
		for(Object obj:c1){
			System.out.println("-->"+obj);
		}
		
		
	
	}

}
