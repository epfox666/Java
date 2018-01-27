package day10;

public class Demo7 {
public static void main(String[] args) {
	Bmw5 b=new Bmw5("epfox", "blue", 20, "111", 100, "e300");
	b.show();
}
}
class Car2{
	String name;
	String color;
	double price;
	String no;
	Car2(){}
	Car2(String name,String color,double price,String no){
		this.name=name;
		this.color=color;
		this.price=price;
		this.no=no;
	}
	void show() {
		System.out.println("父类Car2的show:"+name+","+color+","
				+price+","+no);
	}
}
class Bmw5 extends Car2{
	int speed;
	String type;
	Bmw5(String name,String color,double price,String no,
			int speed,String type){
	super(name,color,price,no);
	this.speed=speed;
	this.type=type;
	}
	void show() {
		System.out.println("子类Bmw5的show:"+name+","+color+","
				+price+","+no+","+speed+","+type);
}
}