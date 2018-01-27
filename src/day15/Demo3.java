package day15;

public class Demo3 {
	  public static void main(String[] args) {
		Singleton2 s1=Singleton2.get();
		Singleton2 s2=Singleton2.get();
	//	Singleton2 s3=new Singleton2();
		System.out.println(s1.equals(s2));
		System.out.println(s2);
	  }
	}

	class Singleton2{
		private Singleton2(){}
	    private static Singleton2 s2   =    	new Singleton2();
     	public static Singleton2 get(){
	        	return s2;
	    }
		
	}
