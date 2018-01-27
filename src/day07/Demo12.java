//带参数无返回值
package day07;
import java.util.*;
public class Demo12 {
static void add(int num1,int num2) {
	int sum=num1+num2;
	System.out.println(sum);
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	add(a,b);

}
}
