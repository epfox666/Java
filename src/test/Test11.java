package test;

public class Test11 {

}
class Singleton1{
	private Singleton1(){}
	private static Singleton1 s1=new Singleton1();
	public static Singleton1 getInstance() {
		return s1;
	}
}

class Singleton2{
	private Singleton2() {}
	private static Singleton2 s2=null;
	public static Singleton2 getInstance() {
		if(s2==null) {
			s2=new Singleton2();
		}	
		return s2;
	}
}