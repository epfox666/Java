package day09;

public class Demo1 {
public static void main(String[] args) {
	Person p=new Person("epfox", 18, "anshan");
	p.show();
}
}
class Person{
	String name;
	int age;
	String address;
	Person(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;	
	}
	void show() {
		System.out.println(name+","+age+","+address);
	}
}
