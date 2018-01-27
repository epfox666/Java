//带参数带返回值
package day07;
import java.util.Scanner;
public class Demo14 {
static int add(int num1,int num2) {
	int num=num1+num2;
	System.out.println(num);
	return num;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int res=add(a,b);
	
}
}
