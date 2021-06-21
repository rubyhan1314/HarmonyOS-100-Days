package com.cxk.demo01;
//实体类：表示具有某些特征或者某些行为的类
//描述多个对象所具有的共同特征和共同行为

/**
 * step1：描述人类：类别――>创建人这个类
 * 
 * 	思路：将人类对象的共同特征，进行抽取
 * 
 * 静态属性：外部特征，name，age，sex，address。。。。
 * 动态属性：动作行为，eat(),sleep(),work(),dadoudou()...
 * 
 * @author ruby
 *
 */
public class Person {
	//step2：成员变量
	String name;//使用String类型的变量name，表示人类中的姓名。默认值null
	
	int age;//使用int类型的变量age，表示人类中的年龄。默认值0
	
	char sex;//使用char类型的变量sex，表示人类中的性别.默认值\u0000
	
	//step3：成员方法
	public void eat(){
		System.out.println("吃饭啦。。");
	}
	
	public void sleep(){
		System.out.println("睡觉啦。。");
	}
	
	public void daDouDou(){
		System.out.println("打豆豆。。。");
	}
}