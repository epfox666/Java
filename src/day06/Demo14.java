package day06;
import java.util.*;
public class Demo14 {
	public static void main(String[] args) {	
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
   switch(a) {
   case 1:
    System.out.println("注册");
    break;
   case 2:
	 System.out.println("登陆");
	 break;
   case 3:
	   System.out.println("退出");
	   break;
	   default:
	System.out.println("没有这种操作");	   
   }
}
}
