package day10;

public class Demo10 {
	public static void main(String[] args) {
		//  Person p1=new Person("epfox",18);
		Person t1=new Teacher("epfox",18);
		int sum=t1.add(10, 10);
		System.out.println(sum);
		t1.show();
		t1.show2();
		
	}

}
abstract class Person {
	String name;
	int age;
/*	Person(){}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	*/
	void show() {
		System.out.println(name+","+age);
	}
	abstract int add(int num1,int num2);
	abstract void show2();
}
class Teacher extends Person{
	Teacher(String name,int age){
		//super(name,age);	
		this.name=name;
		this.age=age;
	}
	@Override
	int add(int num1, int num2) {
		 int result = num1 + num2;
		  return result;
	}

	@Override
	void show2() {
		System.out.println("’‚ «show2"+","+name+","+age);
		
	}
	
}