package day09;

public class Demo7 {
public static void main(String[] args) {
	Teacher t=new Teacher();
	t.name="��";
	t.sex="��";
	t.age=35;
	t.salary=1000000;
	t.address="�Ϻ�";
	t.show();
	t.getYearSalary();
}
}
class Person2{
	String name;
	int age;
	String sex;
	void show() {
		System.out.println(name+","+age+","+sex);
	}
}
class Teacher extends Person2{
	double salary;
	String address;
	void getYearSalary() {
		double result=salary*12;
		System.out.println(name+"����н��"+result);
	}
}