package day11;

public class Demo6 {
public static void main(String[] args) {
	Worker w1 = new Worker("����",32);
	Worker w2 = new Worker("����",34);
	Worker w3 = new Worker("����",36);
	Worker w4 = new Worker("�ƺ���",33);
	Worker w5 = new Worker("���˰�",32);
	Worker w6 = new Worker("����",36);
	Worker.getMoney();
}
}
class Worker{
	String name;
	int age;
	static int num=0;
	Worker(String name,int age){
		this.name=name;
		this.age=age;
		num++;
	}
	static void getMoney() {
		double result=num*10000;
		System.out.println("�ܵĹ���֧����"+result);
	}
}