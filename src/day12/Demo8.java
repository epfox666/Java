package day12;

public class Demo8 {
	  public static void main(String[] args) {
			Emp emp = new Emp();
			emp.m1();
			emp.m2();
			emp.m3();
			emp.m();
		  }
}
interface Moo1{
	void m1();
}
interface Moo2{
	void m2();
}
interface Moo3{
	void m3();
}
interface Moo extends Moo1,Moo2,Moo3{
	void m();
}

class Emp implements Moo{

	@Override
	public void m1() {
		 System.out.println("�ӿ�Moo1�ķ���");
		
	}

	@Override
	public void m2() {
		  System.out.println("�ӿ�Moo2�ķ���");	
		
	}

	@Override
	public void m3() {
		System.out.println("�ӿ�Moo3�ķ���");
		
	}

	@Override
	public void m() {
		  System.out.println("�ӿ�Moo�ķ���");
		
	}
	
}
