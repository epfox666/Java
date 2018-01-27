package day08;

public class Demo7 {
public static void main(String[] args) {
	Teacher t=new Teacher("刘英谦",40,"man",200000);
	t.show();
}
}
class Teacher{
	String name;
	int age;
	String sex;
	double salary;
	Teacher(String name1,int age1,String sex1,double salary1){
		name=name1;
		age=age1;
		sex=sex1;
		salary=salary1;
	}
	void show() {
		System.out.println(name+","+age+","+sex+","+salary);
	}
}
