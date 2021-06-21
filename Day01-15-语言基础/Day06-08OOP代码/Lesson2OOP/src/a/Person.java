package a;
public class Person{
  	public String name;
  	protected int age;
  	char sex;
  	private double sal;
  	public Person(){}
  	public Person(String name, int age, char sex, double sal){
    	this.name = name;
      	this.age = age;
      	this.sex = sex;
      	this.sal = sal;
  	}
  	public static void main(String[]args){
    	Person p = new Person("张三", 12, 'm', 5000);
      	System.out.println(p.name);
      	System.out.println(p.age);
      	System.out.println(p.sex);
      	System.out.println(p.sal);
  	}
}