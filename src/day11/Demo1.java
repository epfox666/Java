package day11;



public class Demo1 {
public static void main(String[] args) {
	Car benz= new Benz("����ʦ����",0);
	Car benz2 = new Benz("����ʦ����",0);
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
		  System.out.println(name+"������");
		
	}

	@Override
	void run() {
		System.out.println(name+"��ʻ���ٶ���"+speed);	
		
	}

	@Override
	void stop() {
		  speed = 0;
		  System.out.println(name+"ɲ��,�ٶ���"+speed);
		
	}
	
}