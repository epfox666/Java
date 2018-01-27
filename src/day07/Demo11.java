//有返回值没参数
package day07;
import java.util.*;
public class Demo11 {
static double sub() {
	Scanner s=new Scanner(System.in);
	double num1=s.nextDouble();
	double num2=s.nextDouble();
	double num=num1-num2;
	return num;
}
public static void main(String[] args) {
	double res = sub();
	System.out.println(res);
}
}
