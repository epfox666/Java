package day11;

public class Demo5 {
public static void main(String[] args) {
	Student s1=new Student("刘",45);
	System.out.println("人数："+Student.num);
	System.out.println("人数："+s1.num);
	Student s2=new Student("白起",35);
	Student s3=new Student("廉颇",45);
	Student s4=new Student("赵广义",35);
	Student s5=new Student("岳飞",30);
	System.out.println("总的人数："+	Student.num);
	System.out.println("总的人数："+	s1.num);
}
}
class Student{
	String name;
     int age;
	static int num=0;
	Student(String name,int age){
		this.name=name;
		this.age=age;
		num++;
	}
}