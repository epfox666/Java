package day14;
import java.util.*;
public class Demo6 {
   public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("���������");
	int num=scanner.nextInt();
	try {
		int result=10/num;
		System.out.println(result);
	}catch(Exception e) {
		System.out.println("��������Ϊ��");
	}
}
}
