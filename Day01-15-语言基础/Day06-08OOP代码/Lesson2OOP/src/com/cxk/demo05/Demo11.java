package com.cxk.demo05;

public class Demo11 {
	

	public static void main(String[] args) {
		// 1.先创建一个父类对象
		Animal a1 = new Animal();
		a1.name = "动物";// 父类的对象，访问父类的属性和方法
		a1.age = 1;
		a1.eat();// 父类对象，访问父类的方法。和子类无关。
		a1.sleep();

		System.out.println("-----------------------");
		// 2.创建子类的对象
		Cat c1 = new Cat();
		c1.name = "小猫";// 子类对象，访问父类的属性
		c1.age = 1;
		c1.color = "白色";// 子类对象，访问子类的新增属性
		c1.eat();// 子类对象，方法重写后的方法
		c1.sleep();// 子类对象，访问父类的方法
		c1.catchMouse();// 子类对象，访问子类的新增方法
		System.out.println("-----------------------");

		Dog d1 = new Dog();
		d1.name = "哮天犬";
		d1.age = 2;
		d1.sleep();
		d1.eat();// 重写的方法
		d1.lookDoor();// 新增的方法
		System.out.println("--------------------");

		// 3.a2能否创建成功？属性：name，age，没有color。方法:sleep(),eat(),没有catchMouse()
		// 向上转型
		Animal a2 = new Cat();// =左边看成是类型，=右边是对象本身。 我是个猫，但是看成动物。
		a2.name = "梨花";
		a2.age = 2;
		a2.sleep();
		a2.eat();// 重写的eat方法
		// a2.catchMouse();//不能调用子类的新增方法。
		// 如果想让这个猫，能够调用catchMouse()的方法，以及新增的属性color需要将它再向下转型。
		// 向下转型
		Cat c2 = (Cat) a2;// 将子类类型的对象，再赋值给子类类型的引用。
		c2.color = "花色";
		c2.catchMouse();

		// 4.a3能否创建成功？属性？方法？
		Animal a3 = new Dog();// =左边看成是类型，=右边是对象本身。 我是个狗，但是看成动物。
		a3.name = "大黄";
		a3.age = 3;
		a3.eat();
		a3.sleep();
		// a3.lookDoor();//不能调用子类的新增方法。

		// 5.c2能否创建成功？属性？方法？
		// Cat c2 = new Animal();

		// 6.c3能否创建成功？属性？方法？
		// Cat c3 = new Dog();

		System.out.println("------------------------");

		Animal a4 = new Animal();
		Animal a5 = new Dog();
//		Dog d2 = (Dog) a4;// 报错了：java.lang.ClassCastException:
							// com.cxk.demo05.Animal cannot be cast to
							// com.cxk.demo05.Dog
//		Dog d3 = (Dog) a5;
		// 向下转型前，应该先使用instanceof来进行判断
		System.out.println(a5 instanceof Dog);// false

		if (a5 instanceof Dog) {
			Dog dog = (Dog) a5;
			dog.eat();
		} else {
			System.out.println("不能转啊。。。会失败。因为a5不是个dog。。");
		}
		if (a4 instanceof Cat) {
			Cat cat = (Cat) a4;
			cat.eat();
		} else {
			System.out.println("不能转啊。。。会失败。因为a4不是个cat。。");
		}

		
		
		Animal a7 = new Animal();
		Animal a8 = new Cat();
		Animal a9 = new Dog();

		Cat c7 = new Cat();
		Dog d7 = new Dog();
		System.out.println(a7 instanceof Animal);// true
		System.out.println(a8 instanceof Animal);// true
		System.out.println(a9 instanceof Animal);// true
		System.out.println(c7 instanceof Animal);// true
		System.out.println(d7 instanceof Animal);// true

		System.out.println(a8 instanceof Cat);// true
		System.out.println(a9 instanceof Dog);// true
		System.out.println(c7 instanceof Cat);// true
		System.out.println(d7 instanceof Dog);// true

		System.out.println(a8 instanceof Dog);// false

	}

}
