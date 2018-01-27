package day11;

public class Demo2 {
	public static void main(String[] args) {
		Person p1=new Teacher();
		p1.name="刘谦";
		p1.show();
		p1.add(5, 5);
		//p1.welcome();
		Teacher p2=new Teacher();
		p2.name="刘老师";
		p2.show();
		p2.add(5, 5);
		p2.welcome();
} 
}
class Person{
	String name;
	void show() {
		System.out.println("今天早上，阿根廷输了...可怜的梅西");
	}
	  void add(int num1,int num2){
			System.out.println(num1+num2);
		  }
}
class Teacher extends Person{
	void show() {
		System.out.println(name+"昨天熬夜看球");
	}
	void welcome() {
		System.out.println("北京欢迎你...");
	}
}