package com.cxk.demo02;
/**
 * 接口泛型
 * @author 程序咖 韩茹
 *
 * @param <T1>
 * @param <T2>
 */
public interface A<T1,T2> {
	public T1 test1(T2 t);
	public void test2(T1 t);
}
