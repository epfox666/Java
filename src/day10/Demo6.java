package day10;

public class Demo6 {
public static void main(String[] args) {
	User4 u4=new User4();
	System.out.println(u4.age);
}
}
class Person4{
	int age=12;
}
class User4 extends Person4{
	int age=13;
}