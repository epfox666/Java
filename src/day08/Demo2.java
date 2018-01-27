package day08;

public class Demo2 {
	public static void main(String[] args) {
		  Kongtiao kongtiao1=new Kongtiao();
		     kongtiao1.name="美的";
		     kongtiao1.type="壁挂";
		     kongtiao1.price=10000;
		     kongtiao1.degree=25;
		     kongtiao1.hot();
		     kongtiao1.hot();
		     kongtiao1.hot();
		     kongtiao1.hot();
		     kongtiao1.cool();
		   Kongtiao kt2=new Kongtiao();
		   kt2.name="格力";
		   kt2.type="立式";
		   kt2.price=20000;
		   kt2.degree=30;
		   kt2.cool();
		   kt2.cool();
		   kt2.cool();
		   kt2.cool();
		   kt2.cool();
		   kt2.hot();
	}

     
}
class Kongtiao{
	String name;
	String type;
	double price;
	int degree;
	void hot() {
		degree++;
		System.out.println(name+"升温以后，温度是"+degree);
	}
	void cool() {
		degree--;
		System.out.println(name+""+"降温以后，温度是"+degree);
	}
}