package day12;

public class Demo9 {

}
interface Eoo{
	  void f1();
	}
	interface Noo{
	  void f2();
	}
	class User implements Eoo,Noo{	
		@Override
		public void f1() {
		  System.out.println("Eoo�ӿ��з���");
		}
		@Override
		public void f2() {
		  System.out.println("Noo�ӿ��еķ���");
		}
	}