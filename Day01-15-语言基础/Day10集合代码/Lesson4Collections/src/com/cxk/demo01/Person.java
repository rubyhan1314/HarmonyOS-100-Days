package com.cxk.demo01;
/**
 * 先创建了一个Person类
 * @author hanru
 *
 */
public class Person{
	private String name;
	private int age;
	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(obj instanceof Person){
			Person p  = (Person) obj;
			if(this.age == p.age && this.name .equals(p.name)){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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
	
	
	
}