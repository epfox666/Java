package day03;

public class Demo10 {
public static void main(String[] args) {
	int year=2000;
	boolean flag;
	String res;
	flag=(year%4==0&&year%100 !=0) || year%400==0;
	res= flag==true? "是" :"不是";
	System.out.println(res);
}
}
