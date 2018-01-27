package day15;
import java.util.*;
public class Demo1 {
   public static void main(String[] args) {
//	  Scanner sc = new Scanner(System.in);
//	  int num=sc.nextInt();
	  Car car1=CarFactory.getInstance(1);
	  Car car2=CarFactory.getInstance(2);
	  Car car3=CarFactory.getInstance(3);
	  car1.start();
	  car2.start();
	  car3.start();
//	  car.run();
//	  car.stop();
}
}
 class CarFactory{
 public static  Car getInstance(int type) {
		Car car=null;
		if(type==1) {
			car=new Bmw();
		}else if(type==2) {
			car=new Taxi();
		}else if(type==3) {
			car =new QQ();
		}
		return car;
	}
}
interface Car{
	void start();
	void run();
	void stop();
}
class Taxi implements Car{
	@Override
	public void start() {
		 System.out.println("��������");
		
	}

	@Override
	public void run() {
		System.out.println("������ʻ");
		
	}

	@Override
	public void stop() {
		System.out.println("����ɲ��");
		
}
}
class Bmw implements Car{
	@Override
	public void start() {
		 System.out.println("��������");
		
	}

	@Override
	public void run() {
		System.out.println("������ʻ");
		
	}

	@Override
	public void stop() {
		System.out.println("����ɲ��");
		
}
}
 class QQ implements Car{

	@Override
	public void start() {
		 System.out.println("QQ����");
		
	}

	@Override
	public void run() {
		System.out.println("QQ��ʻ");
		
	}

	@Override
	public void stop() {
		System.out.println("QQɲ��");
		
	}
}

