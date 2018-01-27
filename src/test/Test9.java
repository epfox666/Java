package test;

public class Test9 {
public static void main(String[] args) {
	Emp emp=new Emp();
	System.out.println(emp.getAge());
}
}
class Emp{
	private String name;
	private static int age;
	public static int getAge(){
		return age;
	}
	
}
