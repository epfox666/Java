package day11;

public class Demo2 {
	public static void main(String[] args) {
		Person p1=new Teacher();
		p1.name="��ǫ";
		p1.show();
		p1.add(5, 5);
		//p1.welcome();
		Teacher p2=new Teacher();
		p2.name="����ʦ";
		p2.show();
		p2.add(5, 5);
		p2.welcome();
} 
}
class Person{
	String name;
	void show() {
		System.out.println("�������ϣ�����͢����...������÷��");
	}
	  void add(int num1,int num2){
			System.out.println(num1+num2);
		  }
}
class Teacher extends Person{
	void show() {
		System.out.println(name+"���찾ҹ����");
	}
	void welcome() {
		System.out.println("������ӭ��...");
	}
}