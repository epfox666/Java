package day11;

public class Demo5 {
public static void main(String[] args) {
	Student s1=new Student("��",45);
	System.out.println("������"+Student.num);
	System.out.println("������"+s1.num);
	Student s2=new Student("����",35);
	Student s3=new Student("����",45);
	Student s4=new Student("�Թ���",35);
	Student s5=new Student("����",30);
	System.out.println("�ܵ�������"+	Student.num);
	System.out.println("�ܵ�������"+	s1.num);
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