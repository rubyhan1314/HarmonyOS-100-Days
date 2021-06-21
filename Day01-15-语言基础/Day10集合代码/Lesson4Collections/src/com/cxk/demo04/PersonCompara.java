package com.cxk.demo04;

import java.util.Comparator;
/*
 * PersonCompara实现了Comparator
 */
public class PersonCompara implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		/*
		 * 排序规则：
		 * 	1.按照年龄从小打大
		 * 	2.年龄相同，按照姓名的自然顺序。
		 */
		//o1-->this，o2-->o
		if(o1.getAge() > o2.getAge()){
			return 1;
		}else if(o1.getAge() < o2.getAge()){
			return -1;
		}else{
			return o1.getName().compareTo(o2.getName());
		}
	}


}
