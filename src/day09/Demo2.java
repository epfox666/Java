package day09;

public class Demo2 {
  public static void main(String[] args) {
	Emp emp=new Emp("epfox",18,200000);
	emp.show();
}
}
class Emp{
	String name;
	int age;
	double salary;
	Emp(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	void show() {
		System.out.println(name+","+age+","+salary);
	}
}