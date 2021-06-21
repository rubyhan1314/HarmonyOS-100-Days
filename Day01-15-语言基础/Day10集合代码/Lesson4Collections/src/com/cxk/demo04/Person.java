package com.cxk.demo04;

public class Person {
	private String name;
	private int age;
	
	/*
	重写hashCode()的原则：
	A：对象相同，那么hashCode码必须相同。
		对象的属性都相同
	B：对象不同，那么hashCode码尽量不同。
		对象的属性不相同
		

	 */
	
	/*
		Person p1 = new Person("a", 18);
			hashCode = name + age
					 = 97 + 18
					 = 115
		Person p2 = new Person("b", 17);
			hashCode = name + age
					 = 98 + 17
					 = 115
		
	 */
	
	
//	@Override
//	public int hashCode() {
//		System.out.println("hashCode()......");
//		return name.hashCode() + age; //将属性值累加求和：int
//	}
	
	
	/*
	重写equals()的原则：
	A：对象相同，必须返回true。
		属性都相同
	B：对象不同，必须返回false
		
		
		Person p1 = new Person("a", 18);
		Person p2 = new Person("b", 17);
		
		equals()->false
	 */
	
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("equals().....");
//		if(this == obj){
//			return true;
//		}
//		if( obj instanceof Person){
//			Person p = (Person) obj;
//			if(this.name.equals(p.name) && this.age == p.age){
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	
	
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
