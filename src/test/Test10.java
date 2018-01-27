package test;

public class Test10 {
public static void main(String[] args) {
	Koo koo=new Koo(1,2);
	koo.add();
	Koo1 koo1=new Koo1(1,2);
	koo1.add();
	koo1.add2();
}
}
class Koo{
	int num1;
	int num2;
	Koo(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	void add() {
		int num3=num1+num2;
		System.out.println(num3);
	}
}

class Koo1 extends Koo{

	Koo1(int num1, int num2) {
		super(num1, num2);
	}
	void add2() {
		this.add();
	}
}