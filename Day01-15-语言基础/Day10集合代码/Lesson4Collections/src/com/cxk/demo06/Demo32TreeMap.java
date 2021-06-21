package com.cxk.demo06;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Demo32TreeMap {

	public static void main(String[] args) {
		//将Student对象，存入到Map中，作为key，value：【优秀，良好，中等，及格，不及格】
		/*
		 * new TreeSet()-->Comparable
		 * new TreeSet(Comparator)-->Comparator
		 * 
		 * new TreeMap()-->Comparable
		 * new TreeMap(Comparator)-->Comparator
		 */
		
		
		TreeMap<Student, String> map  =new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				//1.成绩：从高到低
				if(o1.getScore()>o2.getScore()){
					return -1;
				}else if(o1.getScore()<o2.getScore()){
					return 1;
				}else{
					//2.年龄：从小到大
					if(o1.getAge() < o2.getAge()){
						return -1;
					}else if(o1.getAge() > o2.getAge()){
						return 1;
					}else{
						//3.姓名
						return o1.getName().compareTo(o2.getName());
					}
				}
			}
		});
		map.put(new Student("王二狗", 18, 88), "良好");
		map.put(new Student("李小花", 17, 98), "优秀");
		map.put(new Student("Rose", 17, 88), "良好");
		map.put(new Student("Ruby", 18, 88), "良好");
		
//		Set<Student> keySet = map.keySet();
//		Iterator<Student> it2 = keySet.iterator();
		
		
		Iterator<Student> it = map.keySet().iterator();
		while(it.hasNext()){
			Student student = it.next();
			System.out.println(student+"\t"+map.get(student));
		}
		
		
	}

}
