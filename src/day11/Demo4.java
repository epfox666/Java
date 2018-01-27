package day11;

public class Demo4 {
public static void main(String[] args) {
	User user=new User("张无忌","男",20,
			"zhang@163.com",false,10);
	
	user.setName("东风不败");
	user.setSex("不清楚");
	
	System.out.println(user.getName());
	System.out.println(user.getEmail());
	System.out.println(user.getSex());
	System.out.println(user.getSalary());
	System.out.println(user.getAge());
	System.out.println(user.isMarry());
}
}
class User{
	private String name;
	private String sex;
	private int age;
	private String email;
	private boolean marry;
	private double salary;
	public User() {		
	}
	public User(String name,String sex,int age,String email,
			boolean marry,double salary) {
	this.name=name;
	this.sex=sex;
	this.age=age;
	this.email=email;
	this.marry=marry;
	this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isMarry() {
		return marry;
	}
	public void setMarry(boolean marry) {
		this.marry = marry;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}