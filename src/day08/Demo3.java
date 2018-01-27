package day08;

public class Demo3 {
public static void main(String[] args) {
	Box b=new Box();
	b.length=10;
	b.width=5;
	b.high=8;
	b.getTiji();
}
}
class Box{
	int length;
	int width;
	int high;
	void getTiji() {
		int result=length*width*high;
		System.out.println("该长方体体积是"+result);
	}
	
}