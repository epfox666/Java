package day12;

public class Demo2 {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("epfox");
		System.out.println(p1.getName());
		//p1.age=33;
	}


}
class Person{
	private String name;
	final int age=18;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
