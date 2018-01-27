package friend1;

public class Demo2 {
public static void main(String[] args) {
	Person p1=new Person();
	System.out.println(p1.name);
}
}
class Person{
	//默认的访问修饰符修饰，本类内，包下
	String name="epfox";
}
