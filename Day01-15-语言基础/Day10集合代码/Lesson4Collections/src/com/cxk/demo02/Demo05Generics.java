package com.cxk.demo02;


class Point1{
	private int x;
	private int y;
	private int z;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
}

class Point2{
	private double x;
	private double y;
	private double z;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
}

class Point3{
	private String x;
	private String y;
	private String z;
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getZ() {
		return z;
	}
	public void setZ(String z) {
		this.z = z;
	}
}
/**
 * 泛型作用在类上，当创建对象的时候，决定该类型。
 * @author hanru
 *
 * @param <T> 泛型
 */
class Point<T>{//type
	private T x;
	private T y;
	private T z;
	
	
	public static <M> M test(M m){//静态方法如果要使用泛型，不能使用类的。需要自己独立声明
		System.out.println(m);
		return m;
	}
	
	public void setX(T x){//类上的泛型，可以作用在普通方法上。
		this.x= x;
	}
	public T getX(){
		return x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	public T getZ() {
		return z;
	}
	public void setZ(T z) {
		this.z = z;
	}
	
}
public class Demo05Generics {
	
	public static void main(String[] args) {
		Point1 p1 = new Point1();
		p1.setX(1);
		p1.setY(2);
		p1.setZ(3);
		System.out.println(p1.getX()+","+p1.getY()+","+p1.getZ());
		
		Point2 p2 = new Point2();
		p2.setX(1.2);
		p2.setY(2.1);
		p2.setZ(3.1);
		System.out.println(p2.getX()+","+p2.getY()+","+p2.getZ());
		
		Point3 p3 = new Point3();
		p3.setX("北纬108");
		p3.setY("东经89");
		System.out.println(p3.getX()+","+p3.getY());
		
		
		Point<Integer> p4 = new Point<Integer>();
		p4.setX(1);
		p4.setY(3);
		p4.setZ(5);
		System.out.println(p4.getX()+","+p4.getY()+","+p4.getZ());
		
		Point<String> p5 = new Point<String>();
		p5.setX("。。。");
		
		//如果不给泛型确定类型，那么就意味着擦除这个泛型，该类型就是Object类型
//		Point p6 = new Point();//Object
		
		
		
		
		
		
		
		
		
		
		
	}

}
