package com.cxk.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.zip.CRC32;

public class Demo07Generics {

	public static void main(String[] args) {
		//1.不适用泛型，默认存储的都是Object类型。无论实际类型是哪种，都会发生对象的向上转型的。
		Collection c1 = new ArrayList();
		c1.add("abc");//String-->Object
		c1.add(100);//int->Integer-->Object
		
		//for-each遍历
		for(Object obj:c1){
			if(obj instanceof String){
				String s = (String) obj;//自己手动的向下转型
				System.out.println(s);
			}
		}
		
		System.out.println("----------------------");
		//2.使用泛型
		Collection<String> c2 = new ArrayList<>();
		c2.add("aaa");//String-->String
		c2.add("bbb");
		c2.add("ccc");
		c2.add("123");//String
		System.out.println(c2);
		
		for(String s:c2){
			System.out.println(s);
		}
		
	
//		Collection<int> c3 = new ArrayList<>();//报错，不能明目张胆写基本类型作为泛型
		Collection<Integer> c3 = new ArrayList<>();
		c3.add(100);//int-->Integer,自动装箱
		c3.add(200);
//		c3.add("123");//报错，不允许，，泛型Integer，就只能存储Integer的对象。。不能存储String等其他的类型了
		
		for(int i:c3){//自动拆箱
			System.out.println(i);
		}
		
		
	}

}
