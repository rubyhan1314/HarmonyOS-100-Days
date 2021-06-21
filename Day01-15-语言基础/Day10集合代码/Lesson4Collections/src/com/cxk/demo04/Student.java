package com.cxk.demo04;
/**
 * 实现Comparable接口
 * @author hanru
 *
 */
public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private double score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student() {
		super();
	}
	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Student o) {
//		排序规则：
//		1.成绩从高到低排序
//		2.如果成绩相同，年龄从小到大。
//		3.如果年龄也相同，比较姓名，
//		4.如果姓名也相同，说明是重复的元素，不存储
		//1.成绩从高到低排序
		if(this.score > o.score) {
			return -1;
		}else if(this.score < o.score){
			return 1;
		}else{
			//2.如果成绩相同，年龄从小到大。
			if(this.age < o.age){
				return -1;
			}else if(this.age > o.age){
				return 1;
			}else{
				//3.如果年龄也相同，比较姓名，
				return this.name.compareTo(o.name);
			}
		}
		
	}
	
	
}
