package com.cxk.demo05;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 * @author hanru
 *
 */
public class Demo23Queue {
    public static void main(String[] args) {
    	//使用LinkedList创建一个Queue
        Queue<String> elementQueue = new LinkedList<>();

        // 添加一些元素
        elementQueue.add("程序咖");
        elementQueue.add("Ruby");
        elementQueue.add("王二狗");

        System.out.println("队列 : " + elementQueue);
        // Check is a Queue is empty
        System.out.println("队列是空的嘛? : " + elementQueue.isEmpty());

        // Find the size of the Queue
        System.out.println("队列的大小 : " + elementQueue.size());

        // Check if the Queue contains an element
        String name = "王二狗";
        if(elementQueue.contains(name)) {
            System.out.println("队列里包含了： " + name);
        } else {
            System.out.println("队列里没有： " + name);
        }


        /*
         * 1.remove(),获取并删除队头一个元素
         * 当队列为空的时候，抛出异常NoSuchElementException
         * 
         */
        String name1 = elementQueue.remove();
        System.out.println("remove() : " + name1  );
        System.out.println("移出后：" + elementQueue);

        /*
         * 2.poll(),获取并删除队头一个元素
         * 当队列为空的时候，返回null
         */
        String name2 = elementQueue.poll();
        System.out.println("poll() : " + name2 );
        System.out.println("移出后：" + elementQueue);
        
 
        /*
         * 3.element(),获取对头元素，但不删除
         * 如果队列为空，会抛出异常：NoSuchElementException
         */
        String name3 =  elementQueue.element();
        System.out.println("elememt()：" + name3);
        System.out.println("队列："+elementQueue);
        
        /*
         * 4.peek()，获取对头元素，但不删除
         * 当队列为空的时候，返回null
         */
        String name4 =  elementQueue.peek();
        System.out.println("peek()：" + name4);
        System.out.println("队列："+elementQueue);
    }
}