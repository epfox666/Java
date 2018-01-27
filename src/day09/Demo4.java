package day09;

public class Demo4 {
public static void main(String[] args) {
	Emp2 emp=new Emp2("epfox","man",18);
	emp.show();
	emp.show("anshan","130XXXXXXX");
}
}
class Emp2{
	String name;
	String sex;
	int age;
	String address;
	String phone;
	Emp2(String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	void show(String name,String phone){
		this.name=name;
		this.phone=phone;
		System.out.println(name+","+sex+","+age+","+
				"address"+","+"phone");
	}
	void show() {
		System.out.println(name+","+sex+","+age);
	}
}
