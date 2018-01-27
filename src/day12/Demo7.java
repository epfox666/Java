package day12;

public class Demo7 {
	public static void main(String[] args) {
	Bmw bmw = new Bmw();
	bmw.start();
	bmw.run();
	bmw.stop();
	bmw.show();
	Car car1 = new Bmw();
	car1.start();
	car1.run();
	car1.stop();
//	car1.show();
}
}
interface Car{
	public static final String COLOR="蓝色";
	int PRICE =500;
	public abstract void start();
	void run();
	void stop();
}
class Bmw implements Car{

	@Override
	public void start() {
		System.out.println("启动");	
		
	}

	@Override
	public void run() {
		 System.out.println("行驶");
		
	}

	@Override
	public void stop() {
		 System.out.println("刹车");	
		
	}
	void show() {
		System.out.println(Car.COLOR);
		System.out.println(Car.PRICE);
	}
}