package day08;

public class Demo4 {
public static void main(String[] args) {
	Car car1=new Car();
	car1.name="����";
	car1.no="95533";
	car1.price=100000;
	car1.start();
	car1.run();
	car1.stop();
}
}
class Car{
	String name;
	String no;
	double price;
	double speed=0;
	void start(){
		speed=100;
		System.out.println(name+"������");
	}
	void run() {
		System.out.println(name+"������ʻ"+"��ǰ���ٶ���"+speed);
	}
	void stop() {
		speed=0;
		System.out.println(name+"ֹͣ����"+"��ǰ���ٶ���"+speed);
	}
}
