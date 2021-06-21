package com.cxk.demo04;

import java.util.Set;
import java.util.TreeSet;

public class Demo20Student {

	public static void main(String[] args) {
		/*
		 * 创建TreeSet集合：存储学生
		 * 	Student：姓名，年龄，成绩
		 * 
		 */
		//创建学生对象
		Student s1 = new Student("王二狗", 18, 88.6);
		Student s2 = new Student("Rose", 17, 98.5);
		Student s3 = new Student("王二狗", 18, 88.6);
		Student s4 = new Student("Jack", 20, 98.5);
		Student s5 = new Student("Jack", 20, 65.5);
		Student s6 = new Student("Rose", 18, 88.6);
		Student s7 = new Student("李小花", 19, 88.6);
		Student s8 = new Student("古力娜扎", 18, 68.6);
		Student s9 = new Student("李小花", 18, 88.6);
		//存入到TreeSet集合中
		Set<Student> set = new TreeSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		set.add(s8);
		set.add(s9);
		System.out.println(set.size());//打印集合的长度
		
		System.out.println("============成绩单=============");
		System.out.println("序号\t姓名\t年龄\t成绩");
		int no = 1;
		for(Student s:set){
			System.out.println((no++)+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getScore());
		}
		
	}

}
