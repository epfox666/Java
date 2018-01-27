package friend1;

public class Student {
	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println(p1.name);
	}
	
 private int sum1=1;
 
//默认，能在一个包下访问
int num3=3;
 
 
//protected 可以同一个包内，在不同包子类之间，
//子类可以可以访问父类中使用protected修饰的属性和方法
 protected int num2= 2;
 
 

 
 
 public int num4=4;
}
