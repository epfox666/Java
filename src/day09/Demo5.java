package day09;

public class Demo5 {
public static void main(String[] args) {
	Customer c1=new Customer("epfox",18);
	c1.show();
	Customer c2=new Customer("epfox",18,"anshan",2000,"QA");
	c2.show();
	Customer c3=new Customer("epfox",18,"anshan");
	c3.show();
}
}
class Customer{
	String name;
	int age;
	String address;
	double money;
	String job;
	Customer(String name, int age){
		this.name=name;
		this.age=age;
	}
	Customer(String name, int age,String address,
			double money,String job){
		this(name,age);
		this.address=address;
		this.money=money;
		this.job=job;
	}
    Customer(String name,int age,
				  String address){
			this(name,age);
			this.address = address;
		  }	
    void show(){
    	System.out.println("������"+name);
    	System.out.println("���䣺"+age);
    	System.out.println("��ַ��"+address);
    	System.out.println("��"+money);
    	System.out.println("ְҵ��"+job);
      }
}
