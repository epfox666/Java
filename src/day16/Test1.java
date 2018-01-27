package day16;

public class Test1 {
   public static void main(String[] args) {
/*	QQ qq=new QQ();
	qq.run();
	qq.start();
	qq.stop();
*/	
	 Car car1=CarFactory.getInstance(1);
	 car1.run();
	 Car car2=CarFactory.getInstance(2);
	 car2.run();
	 Car car3=CarFactory.getInstance(3);
	 car3.run();
}
}

class CarFactory{
	public static Car car=null;
	public static Car getInstance(int num) {
		if(num==1) {
		  car=new QQ();	
		}else if(num==2) {
	   	 car=new Bmw();	
		}else if(num==3) {
	     car=new Taxi();		
		}
		return car;
	}
}

interface Car{
	void run();
	void start();
	void stop();
}
class QQ implements Car{

	@Override
	public void run() {
		System.out.println("QQ–– ª");
		
	}

	@Override
	public void start() {
		System.out.println("QQ∆Ù∂Ø");
		
	}

	@Override
	public void stop() {
		System.out.println("QQÕ£÷π");
		
	}
	
}
class Bmw implements Car{

	@Override
	public void run() {
		System.out.println("Bmw–– ª");
		
	}

	@Override
	public void start() {
		System.out.println("Bmw∆Ù∂Ø");
		
	}

	@Override
	public void stop() {
		System.out.println("BmwÕ£÷π");
		
	}
	
}
class Taxi implements Car{
       
	@Override
	public void run() {
		System.out.println("Taxi–– ª");
		
	}

	@Override
	public void start() {
		System.out.println("Taxi∆Ù∂Ø");
		
	}

	@Override
	public void stop() {
		System.out.println("TaxiÕ£÷π");
		
	}
}
