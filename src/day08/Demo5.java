package day08;

public class Demo5 {
public static void main(String[] args) {
	Student student1=new Student();
	System.out.println(student1);
	student1.name = "����";
	student1.age = 43;
	student1.sex = "��";
	student1.score = 99;
	student1.show();
	
	Student student2 = student1;
	student2.name = "�ŷ�";
	student2.show();
	
	student1.show();
	System.out.println(student2);
}
}
class Student{
	String name;
	int age;
	String sex;
	int score;
	void show() {
		System.out.println("�����ǣ�"+name);
		System.out.println("�Ա��ǣ�"+sex);
		System.out.println("�����ǣ�"+age);
		System.out.println("�����ǣ�"+score);	
	}
}