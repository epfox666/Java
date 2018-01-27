package day11;



public class Demo1 {
public static void main(String[] args) {
	Car benz= new Benz("刘老师奔驰",0);
	Car benz2 = new Benz("孔老师奔驰",0);
	benz.start();
	benz.run();
	benz.stop();
	benz2.start();
	benz2.run();
	benz2.stop();
}
}
abstract class Car{
	String name;
	int speed;
	abstract void start();
	abstract void run();
	abstract void stop();
}
class Benz extends Car{
	Benz(String name,int speed){
		  this.name = name;
		  this.speed = speed;
	}
	@Override
	void start() {
		  speed = 100;
		  System.out.println(name+"启动了");
		
	}

	@Override
	void run() {
		System.out.println(name+"行驶，速度是"+speed);	
		
	}

	@Override
	void stop() {
		  speed = 0;
		  System.out.println(name+"刹车,速度是"+speed);
		
	}
	
}