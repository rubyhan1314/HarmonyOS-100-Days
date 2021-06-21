package com.cxk.demo05;

public class Demo12 {

	/**
	 * 该方法参数类型为Animal，实际上可以传入任意的Anmila以及其子类类型作为实参
	 * @param a
	 */
	public static void testAnimal(Animal a){
		System.out.println(a.name+","+a.age);
		a.eat();
		a.sleep();
		if(a instanceof Dog){
			Dog dog = (Dog) a;
			dog.lookDoor();
		}
		if(a instanceof Cat){
			Cat cat = (Cat) a;
			cat.catchMouse();
		}
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name = "布偶";
		cat.age = 3;
		testAnimal(cat);
		
	}
}
