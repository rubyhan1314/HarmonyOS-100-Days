package com.cxk.demo03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo15ListIterator {

	public static void main(String[] args) {
		// 3.创建3个Person类对象，存入ArrayList集合中。并通过3种方式，访问遍历该容器。(迭代器，增强for，普通for)
		Person p1 = new Person("Rose", 19);
		Person p2 = new Person("Jack", 20);
		Person p3 = new Person("Jessica", 23);

		List<Person> list = new ArrayList<>();
		list.add(p1);// 将p1的地址，添加到list集合中
		list.add(p2);
		list.add(p3);
		list.add(new Person("王二狗", 17));

		// 方式一：Iterator
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			// System.out.println(p);//默认打印每一个元素：对象，打印对象的地址
			System.out.println(p.getName() + "\t" + p.getAge()); // 打印对象的各个属性，其实也可以重写toString()
		}
		System.out.println("方式二：-----------------------");
		// 方式二：增强for
		for (Person p : list) {
			System.out.println(p.getName() + "---->" + p.getAge());
		}

		System.out.println("方式三：-----------------------");
		// 方法三：普通for
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			System.out.println(p);
		}
		System.out.println("方式四：-----------------------");
		// 方法四：listIterator
		/*
		 * Iterator：父接口，迭代器 hasNext()--->next() 只能从前向后依次迭代获取
		 * 
		 * ListIterator子接口，List集合特有的迭代器。 hasNext()--->next()，从前向后迭代
		 * hasPrevious()--->previous()，从后向前迭代
		 * 
		 * Iterator或者ListIterator对象：当从集合上获取的时候，默认都在集合的开头。所有的元素之前。
		 */
		ListIterator<Person> listIt = list.listIterator();

		while (listIt.hasNext()) {
			Person p = listIt.next();
			System.out.println(p.getName() + "\t" + p.getAge());
		}

		while (listIt.hasPrevious()) {
			Person p = listIt.previous();
			System.out.println("--->" + p.getName() + "\t" + p.getAge());

			System.out.println(listIt.previous().getName());
		}

		System.out.println("===========================");
		List<Person> list2 = new ArrayList<>();
		list2.add(new Person("aa", 18));
		list2.add(new Person("bb", 19));
		list2.add(new Person("cc", 20));
//		list2.add(new Person("dd", 21));
		
		Iterator<Person> it2 = list2.iterator();
		while(it2.hasNext()){//这种写法，有老大个坑---->判断了1次，但是获取2个元素。
			//所以，每个next前，一定先hasNext()，一个hasNext()对应一个next......
			//System.out.println(it2.next().getName()+"\t"+it2.next().getAge());
			Person p = it2.next();
			System.out.println(p.getName()+","+p.getAge());
		}

	}

}

