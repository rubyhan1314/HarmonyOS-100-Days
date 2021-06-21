package com.cxk.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo04Iterator {

	public static void main(String[] args) {
//		迭代器在工作期间，不要去更改集合的结构。
		Collection c1 = new ArrayList();
		c1.add("aaa");
		c1.add("bbb");
		c1.add("ccc");
		//---->迭代器对象
		
		System.out.println(c1);
		
		Iterator it = c1.iterator();//从集合上获取的迭代器对象：it
		while(it.hasNext()){
			Object s = it.next();
			System.out.println(s);
		}
		
		System.out.println("----------");
		//迭代的注意点：1.一个迭代器对象，从头迭代到后，不能再使用了，因为后面没有元素了，迭代不出来了。。
		while(it.hasNext()){
			Object s2 = it.next();
			System.out.println(s2);
		}
		//2.迭代器工作期间：不能更改集合中的元素的个数。
		Iterator<String> it2 = c1.iterator();
		//it2--> aaa		bbb		ccc
		String s3 = "";
		while(it2.hasNext()){//迭代器在工作期间，相当于锁定了这个集合容器。集合本身不要去删除数据。
		
			if("bbb".equals(s3)){
				c1.remove("bbb");//操作集合，删除一个元素："bbb" ,java.util.ConcurrentModificationException
//				it2.remove();//了解。。
			}
			s3 = it2.next();//aaa ,bbb
			System.out.println(s3);
		}
		System.out.println(c1);
	
		
	}

}
