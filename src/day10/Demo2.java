package day10;

public class Demo2 {
	  public static void main(String[] args){
			Bmw3 bmw = new Bmw3();
			bmw.name = "�ҵı���";
			bmw.no = "66666666";
			bmw.price = 100;	
			bmw.color = "��ɫ";
			bmw.speed = 200;	
			bmw.degree = 26;
			System.out.println(bmw.name+","+bmw.no
				+","+bmw.price+","+bmw.color
				+","+bmw.speed+bmw.degree);
		  }
		}
class Bmw1{
	String name;
	String no;
	double price;
}
class Bmw2 extends Bmw1{
	String color;
	int speed;
}
class Bmw3 extends Bmw2{
	int degree;
}