package day13;

public class Demo2 {
public static void main(String[] args) {
	Person p1=new Person("epfox",18);
	System.out.println(p1);
	System.out.println(p1.hashCode());
	Person p2=new Person("epfox",18);
	System.out.println(p2);
	System.out.println(p2.hashCode());
}
}
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ","
				+ " toString()=" + super.toString() + "]";
	}
	@Override
	  public int hashCode() {	
		return age;
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