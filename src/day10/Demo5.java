package day10;

public class Demo5 {

}
class Person3{
	String name;
	int age;
	Person3(){		
		
	}
	Person3(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class User3 extends Person3{
	String sex;
	User3(String name,int age,String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
}
