package a;
public class Test1{
  	public static void main(String[]args){
    	Person p = new Person("张三", 12, 'm', 5000);
      	System.out.println(p.name);
      	System.out.println(p.age);
      	System.out.println(p.sex);
//      	System.out.println(p.sal);//同包类中无法访问父类中私有成员
  	}
}