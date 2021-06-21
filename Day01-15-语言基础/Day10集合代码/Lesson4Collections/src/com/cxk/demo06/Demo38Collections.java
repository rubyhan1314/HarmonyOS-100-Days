package com.cxk.demo06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo38Collections {
	public static void main(String[] args) {
		/*
		 * 1、Collections.addAll(容器，要添加的元素) 向容器中同时添加多个元素对象
		 */
		List<String> l1 = new ArrayList<String>();
		l1.add("程序咖");
		l1.add("Ruby");// add方法每次只能添加一个元素。
		
		Collections.addAll(l1, "hello", "world", "haha", "hehe");
		System.out.println(l1);
		
		/*
		 * 2.同步线程
		 * static <T> Collection<T> synchronizedCollection(Collection<T> c) 返回指定
		 * collection 支持的同步（线程安全的）collection。 static <T> List<T>
		 * synchronizedList(List<T> list) 返回指定列表支持的同步（线程安全的）列表。 static <K,V>
		 * Map<K,V> synchronizedMap(Map<K,V> m) 返回由指定映射支持的同步（线程安全的）映射。 static
		 * <T> Set<T> synchronizedSet(Set<T> s) 返回指定 set 支持的同步（线程安全的）set。
		 */
		ArrayList<String> l2 = new ArrayList<>();// 线程不安全
		List<String> newL2 = Collections.synchronizedList(l2);
		Collection c = Collections.synchronizedCollection(new ArrayList());
		Map m = Collections.synchronizedMap(new HashMap());

		
		

		
		

		/*
		 * 3.排序
		 * 
		 * static <T extends Comparable<? super T>> void sort(List<T> list) 
		 *  根据元素的自然顺序 对指定列表按升序进行排序。 
		 * 	List集合：有序，存储顺序。有下标 排序：将list集合中的元素进行排序。 类比数组排序
		 * 	
		 * 	list集合中存储的元素，需要具有可比性，如果是存储自定义类型的对象，比如Person等，需要实现比较器接口
		 * 
		 * 
		 * int[] arr = {1,7,4,6,2,5} 排序：冒泡，选择，Arrays.sort()
		 */
		List<Integer> l3 = new ArrayList<>();
		Collections.addAll(l3, 1, 7, 4, 6, 2, 5);
		System.out.println(l3);

		// list->sort，排序，排序规则
		Collections.sort(l3);//默认升序
		System.out.println(l3);

		List<Person> l4 = new ArrayList<>();
		l4.add(new Person("王二狗", 18));
		l4.add(new Person("李小花", 17));
		l4.add(new Person("李铁柱", 19));
		System.out.println(l4);

		Collections.sort(l4);// 使用的是默认的比较器：Comparable

		Collections.sort(l4, new Comparator<Person>() {// 使用的自定义的比较器：Comparator

			@Override
			public int compare(Person o1, Person o2) {
				return 0;
			}
		});

	}
}
