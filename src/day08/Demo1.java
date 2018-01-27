package day08;

public class Demo1 {
	public static void main(String[] args) {
		Person person1=new Person();
		person1.name="刘彻";
		person1.age=26;
		person1.money=100;
        person1.speak();
		person1.add(25, 69);
		
		Person person2=new Person();
		person2.name="嬴政";
		person2.money=95;
		person2.age=55;
		person2.sex="man";
		person2.speak();
		person1.add(100, 100);
	}
}
class Person{
	String name;
	int age;
	String sex;
	double money;
	void speak() {
		System.out.println("我是"+name);
	}
	 void add(int num1,int num2) {
		int sum=num1+num2;
		System.out.println(num1+"+"+num2+"的值是"+sum);
	}
}

