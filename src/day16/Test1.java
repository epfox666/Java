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
		System.out.println("QQ行驶");
		
	}

	@Override
	public void start() {
		System.out.println("QQ启动");
		
	}

	@Override
	public void stop() {
		System.out.println("QQ停止");
		
	}
	
}
class Bmw implements Car{

	@Override
	public void run() {
		System.out.println("Bmw行驶");
		
	}

	@Override
	public void start() {
		System.out.println("Bmw启动");
		
	}

	@Override
	public void stop() {
		System.out.println("Bmw停止");
		
	}
	
}
class Taxi implements Car{
       
	@Override
	public void run() {
		System.out.println("Taxi行驶");
		
	}

	@Override
	public void start() {
		System.out.println("Taxi启动");
		
	}

	@Override
	public void stop() {
		System.out.println("Taxi停止");
		
	}
}
