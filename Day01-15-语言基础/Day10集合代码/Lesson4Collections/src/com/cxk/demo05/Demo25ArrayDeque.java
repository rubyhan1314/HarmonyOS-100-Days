package com.cxk.demo05;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo25ArrayDeque {
 public static void main(String[] args) {
  Deque<Book> set = new ArrayDeque<Book>();
  // 创建书
  Book b1 = new Book(101, "十万个为啥", "王二狗", "清华大学出版社", 8);
  Book b2 = new Book(102, "红楼梦", "曹雪芹", "人民出版社", 4);
  Book b3 = new Book(103, "Golang网络爬虫", "Ruby", "孔壹学院", 6);
  // Adding Books to Deque
  set.add(b1);
  set.add(b2);
  set.add(b3);
  // 遍历
  for (Book b : set) {
	  System.out.println(b);
  }
 }
}