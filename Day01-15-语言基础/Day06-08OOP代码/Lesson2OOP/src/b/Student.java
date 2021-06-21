package b;

import a.Person;

public class Student extends Person{
  	public static void main(String[]args){
    	Person p = new Person("张三", 12, 'm', 5000);
      	System.out.println(p.name);
//    		System.out.println(p.age);//不同包中无法访问protected权限成员
//      	System.out.println(p.sex);//不同包中无法访问默认权限成员
//      	System.out.println(p.sal);//不同包中无法访问private权限成员
      	
      	Student s = new Student();
      	s.name= "王二狗";
      	s.age = 30;//继承的关系中，可以访问从父类继承来的protected修饰的成员
      	System.out.println(s.name);
      	System.out.println(s.age);
  	}
}


