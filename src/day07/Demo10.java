//有返回值没参数
package day07;
import java.util.*;
public class Demo10 {
	static int add() {
		Scanner s=new Scanner(System.in);
		int sum1=s.nextInt();
		int sum2=s.nextInt();
		int sum=sum1+sum2;
		return sum;
	}
public static void main(String[] args) {
	  int res=add();
	  System.out.println(res);
}

}
