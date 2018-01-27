package day12;

public class Demo5 {
public static void main(String[] args) {
	System.out.println(Person1.AGE);
	System.out.println(Person1.NAME);
	
	Person1 p1=new Person1();
	System.out.println(p1.nn);
}
}
class Person1{
	public static final int AGE=20;
	public final static String NAME = "³£Óö´º";
	String nn="epfox";
}