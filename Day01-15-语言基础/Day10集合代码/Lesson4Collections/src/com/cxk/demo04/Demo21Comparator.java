package com.cxk.demo04;

import java.util.Set;
import java.util.TreeSet;

public class Demo21Comparator {

	public static void main(String[] args) {
		/*
		 * 1.Person类：要存储的对象：p1，p2，p3，p4.。。
		 * 
		 * 
		 * 2.TreeSet集合：要存储Person对象，去重，给对象排序
		 * 
		 * 	创建方式一：无参的构造方法	new TreeSet<>()
		 * 		使用Comparable比较器，给对象进行排序
		 * 			compareTo(o)
		 * 
		 *  创建方式二：有参的构造方法 TreeSet(Comparator comparator) 
				构造一个新的，空的树集，根据指定的比较器进行排序。
				
				使用Comparator比较器，给对象进行排序
					compare(o1,o2)
		 * 	3.PersonCompara, -->PersonCompara实现了Comparator	
		 * 
		 * 
		 * compareTo(o)-->int
		 * compare(o1,o2)-->int
		 * 
		 * 正数：
		 * 		this > o 
		 * 		o1 > o2
		 * 负数：
		 * 		this < o
		 * 		o1 < o2
		 * 零：
		 * 		this同o相等
		 * 		o1同o2相等
		 *
		 */
		//方式一：创建TreeSet集合
		Set<Person> set1 = new TreeSet<>();//默认使用Comparable比较器
		
		
		//方式二：创建treeSet集合，指定使用Comparator比较器
		PersonCompara pc = new PersonCompara();//创建Comparator的实现类的对象
		Set<Person> set2 = new TreeSet<>(pc);//指明使用哪个比较器Comparator比较器
		
		set2.add(new Person("程序咖", 19));
		set2.add(new Person("Ruby", 19));
		set2.add(new Person("Ruby", 19));
		set2.add(new Person("王二狗", 18));
		System.out.println(set2.size());
		
		for(Person p: set2){
			System.out.println(p);
		}
		
		
	}

}
