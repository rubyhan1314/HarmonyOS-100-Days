package com.cxk.demo06;


public class Demo16equals {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println(i == j);
		
		
		Cat c1 = new Cat("阿狸", 1, "女");//c1的地址
		Cat c2 = new Cat("阿狸", 1, "女");//c2的地址
		System.out.println(c1 == c2);//false，比较对象的内存地址。new出来的对象，地址肯定不同。
		
		//程序中认为的相同对象：往往是对象的各个属性值相同，我们就认为是相同的对象。
		System.out.println(c1.equals(c2));//比较c1和c2对象是否相等。--->false
//		System.out.println(c1.equals(null));//Object,null,任意子类对象也可以的
//		System.out.println(c1.equals("memeda"));
		
		System.out.println("abc".equals("abc"));//true,String类重写了equals方法，专门比较字符串，""中间的字符串内容相同，就返回true。
	}
}

class Cat{
	String name;
	int age;
	String sex;
	
	@Override
	public boolean equals(Object obj) {//
		//子类重写equals方法：比较对象的各个属性值
		/*
		 * 分析：谁和谁在比较？本类是c1和c2的比较，在方法中，就变成了this和obj的比较
		 * this--->c1
		 * obj--->c2(向上转型),会失去子类新增的属性和方法
		 */
		
		//step1：先判断两个对象的地址是否相同，如果相同，直接返回true即可。不需要比较各个属性值了。
		if(this == obj){
			return true;
		}
		//step2：判断传进来的参数是否为null，如果为null，没法比，直接返回false
		if(obj == null){
			return false;
		}
		
		
		
		//step3:如果执行到此处，认为地址不同了，并且传入的对象不是null，需要比较对象的属性值
//		if(this.getClass() == obj.getClass()){//可以的，获取对象的实际类型， 判断是否相等
			
//		}
		if(obj instanceof Cat){//直接判断obj是否是个Cat对象
			//先将obj，再转回一个Cat类型，才可以比较
			Cat c2 = (Cat) obj;
			//比较对象的属性值是否对应相等
			if(this.age == c2.age && this.name.equals(c2.name)&&this.sex.equals(c2.sex)){
				return true;
			}
		}
		
		return false;
	}
	
	
	
	public Cat() {
		super();
	}
	public Cat(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
}
