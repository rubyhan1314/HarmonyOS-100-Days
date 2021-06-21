package com.cxk.demo01;
//测试类
class PracticeDemo01 
{
	public static void main(String[] args) 
	{
		//需求：开学了，王老师让学生小明，小花，小丽做自我介绍
		//姓名，年龄，爱好，来一段才艺展示
		/*
		老师类
		特征：姓名
		行为：让学生做自我介绍

		学生类
		特征：姓名，年龄，爱好
		行为：才艺展示
		*/
		//1.创建一个老师的对象
		Teacher wang  = new Teacher();
		wang.name = "王老师";

		//2.创建一个学生对象
		Student xiaoming = new Student();
		//赋值
		xiaoming.name = "小明";
		xiaoming.age = 10;
		xiaoming.hobby = "讲段子";

		//3.老师执行自己的行为
		wang.letStuIntroduce(xiaoming);


		Student xiaohua = new Student();
		//赋值
		xiaohua.name = "小花";
		xiaohua.age = 10;
		xiaohua.hobby = "唱歌";
		wang.letStuIntroduce(xiaohua);
	}
}

