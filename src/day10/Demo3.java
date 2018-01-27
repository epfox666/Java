package day10;

public class Demo3 {
public static void main(String[] args) {

	User1 u1=new User1("epfox",18,"man");
	u1.show();
}
}
class Person1{
	String name;
	int age;
	Person1(){}
	void show() {
		System.out.println(name+","+age);
	}
}
class User1 extends Person1{
    String sex;
	User1(String name, int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	void show() {
		System.out.println(name+","+age);
		System.out.println(name+","+age+","+sex);
	}
}