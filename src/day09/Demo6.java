package day09;

public class Demo6 {
public static void main(String[] args) {
	Box b1=new Box(10);
	b1.getTiji();
	Box b2=new Box(10,5,6);
	b2.getTiji();
}
}
class Box{
	int length;
	int width;
	int high;
    Box(int length,int width,int high){
    	this.length =length;
    	this.width=width;
    	this.high=high;
    }
    Box(int leng){
    	this.length=leng;
    	this.width=leng;
    	this.high=leng;
    }
    void getTiji() {
    	int res=length*width*high;
    	System.out.println(res);
    }
}