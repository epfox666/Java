package day09;

public class Demo3 {
public static void main(String[] args) {
	AddCount a=new AddCount();
	a.add(1, 2);
	a.add(1, 2.2);
	a.add(1.2, 2);
	a.add(1.1, 2.2);
  
   }
}
class AddCount{
	void add(int num1,int num2) {
		int sum=num1+num2;
		System.out.println(sum);
	}
	void add(double num1,int num2) {
		double sum=num1+num2;
		System.out.println(sum);
	}
	void add(int num1,double num2) {
		double sum=num1+num2;
		System.out.println(sum);
	}
	void add(double num1,double num2) {
		double sum=num1+num2;
		System.out.println(sum);
	}
}