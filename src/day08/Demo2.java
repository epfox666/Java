package day08;

public class Demo2 {
	public static void main(String[] args) {
		  Kongtiao kongtiao1=new Kongtiao();
		     kongtiao1.name="����";
		     kongtiao1.type="�ڹ�";
		     kongtiao1.price=10000;
		     kongtiao1.degree=25;
		     kongtiao1.hot();
		     kongtiao1.hot();
		     kongtiao1.hot();
		     kongtiao1.hot();
		     kongtiao1.cool();
		   Kongtiao kt2=new Kongtiao();
		   kt2.name="����";
		   kt2.type="��ʽ";
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
		System.out.println(name+"�����Ժ��¶���"+degree);
	}
	void cool() {
		degree--;
		System.out.println(name+""+"�����Ժ��¶���"+degree);
	}
}