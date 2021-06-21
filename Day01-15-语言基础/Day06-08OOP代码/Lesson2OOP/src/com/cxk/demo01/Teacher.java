package com.cxk.demo01;
/**
 * 实体类：老师类
 * @author hanru
 *
 */
class Teacher
{
	String name;

	//参数：学生，Student类型
	public void letStuIntroduce(Student stu) {
		System.out.println(name + "，让学生" + stu.name + "做自我介绍：");
		
		stu.introduce();

		if("小丽".equals(stu.name)) {
			stu.dance();
		} else if("小花".equals(stu.name)) {
			stu.sing();
		} else {
			stu.lie();
		}
	}
}