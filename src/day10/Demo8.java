package day10;

public class Demo8 {
public static void main(String[] args) {
	Emp e1=new Emp("epfox",18,2000);
	Emp e2=new Emp("epfox",18,2000,true);
	e1.show();
    e2.show();
}
}
class Emp{
	String name;
	int age;
	double salary;
	boolean marry;
	Emp(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	Emp(String name,int age,double salary,boolean marry){
		this(name,age,salary);
		this.marry=marry;
	}
	void show() {
		System.out.println(name+","+age+
				","+salary+","+marry);
	}
}