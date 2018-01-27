package day09;

public class Demo8 {
	  public static void main(String[] args){
		   Manager manager = new Manager();
			manager.name = "刘";
			manager.address="北京";
			manager.age = 22;
			manager.job = "产品经理";
			manager.phone="13552329647";
			manager.salary = 999999999;
			manager.show();
  }
}
class Worker{
	String name;
	int age;
	double salary;
	String address;
	void show() {
		System.out.println(name+","+age+","+salary+","+address);
	}
	
}
class Manager extends Worker{
   String phone;
   String job;
}