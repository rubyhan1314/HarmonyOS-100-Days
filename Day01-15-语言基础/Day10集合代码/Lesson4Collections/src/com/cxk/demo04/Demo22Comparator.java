package com.cxk.demo04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo22Comparator {

	public static void main(String[] args) {
		
		
		
//		PersonCompara pc = new PersonCompara();
//		
//		Comparator<Person> c = new PersonCompara();
//		
//		Comparator<Person> c2 = new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
		
		Set<Book> set = new TreeSet<>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				if(o1.getPrice() > o2.getPrice()){
					return -1;
				}else if(o1.getPrice()< o2.getPrice()){
					return 1;
				}
				return o1.getBookName().compareTo(o2.getBookName());
			}
		});
		
		set.add(new Book("孙子兵法", 500.8));
		set.add(new Book("孙子兵法", 500.8));
		set.add(new Book("火影忍者", 625.5));
		set.add(new Book("西游记", 120.8));
		set.add(new Book("三国演义", 120.8));
		
		System.out.println(set.size());
		for(Book book :set){
			System.out.println(book);
		}
	}

}
