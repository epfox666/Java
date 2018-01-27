package day15;

public class Demo2 {

}
class Singleton1{
	private Singleton1() {	}
	private static Singleton1 s1=null;
	private static Singleton1 getInstance() {
		if(s1==null) {
			s1=new Singleton1();
		}		
		return s1;
	}
}