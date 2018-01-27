package day10;

public class Demo4 {
public static void main(String[] args) {
	User2 u2=new User2("epfox",18,"man");
	u2.show();
}
}
class Person2{
	String name;
	int age;
	Person2(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class User2 extends Person2{
     String sex;
	User2(String name, int age,String sex) {
		super(name, age);
		this.sex=sex;
	}
	  void show(){
		  System.out.println(name+","+age+","+sex);
		    }
}
