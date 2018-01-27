package day08;

public class Demo6 {
public static void main(String[] args) {
	Person2 p1=new Person2();
	p1.name = "张居正";
	p1.sex = "男";
	p1.age = 60;
	p1.show();
}
}
class Person2{
	String name;
	int age;
	String sex;
	Person2(){
		System.out.println("创建该Person类的对象");
	}
	void show() {
		System.out.println(name+","+sex+","+age);
	}
}