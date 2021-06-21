package com.cxk.demo03;

import java.util.ArrayList;
import java.util.List;
/**
 * 演示List中的方法：
 * @author hanru
 *
 */
public class Demo10List {

	public static void main(String[] args) {
		//step1：创建容器对象：特点，可以存储重复的元素，有序存储(有下标，index)
		List<String> l1 = new ArrayList<>();
		System.out.println(l1);//[]
		l1.add("aaa");//下标：0
		l1.add("bbb");//1
		l1.add("ccc");//2
		System.out.println(l1);//[aaa, bbb, ccc]
		
		//step2:操作list这个容器
		
		//1.add(index,元素),指定位置添加元素
		l1.add(1,"XXX");//在指定的位置，添加元素
		System.out.println(l1);//[aaa, XXX, bbb, ccc]
		
		
		//2.get(index)-->元素，根据下标位置获取对应的元素
//		System.out.println(l1.get(0));
//		System.out.println(l1.get(1));
//		System.out.println(l1.get(2));
		for(int i=0;i<l1.size();i++){
			System.out.println("-->"+l1.get(i));
		}
		
		//因为list集合是有序的，所以可以搜索元素的位置。
		//3.indexOf()->int，在集合中搜索指定的内容，返回下标，如果不存在就-1
		System.out.println(l1.indexOf("bbb"));
		//4.lastIndexOf()-->int
		System.out.println(l1.lastIndexOf("aaa"));
		
		
		//5.remove(index),根据下标删除指定元素
		l1.remove(2);
		System.out.println(l1);
		
		/*
		 * 6.set(index, 元素);在指定的位置，更新元素。
		 * 第一个参数：index，被替换的元素的位置
		 * 第二个参数：E，新元素
		 * 
		 * 返回值：被替换下来的元素。。
		 */
		System.out.println(l1);
		String s1 = l1.set(2, "王二狗");
		System.out.println(l1);
		System.out.println(s1); //ccc
		
		l1.add("rose");
		l1.add("jack");
		System.out.println(l1);
		
		/*
		 * 7.subList(int fromIndex, int toIndex)，截取子集合
		 * 这个类似于String类的截取子串。
		 */
		List<String> subList = l1.subList(1, 4);
		System.out.println(subList);
		
		
	}

}
