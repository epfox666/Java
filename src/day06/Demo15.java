package day06;
import java.util.*;
public class Demo15 {
	public static void main(String[] args) {	
   Scanner s=new Scanner(System.in);
   int i=s.nextInt();
   switch(i) {
   case 5:
	   System.out.println("优秀");
	   break;
   case 4:
	   System.out.println("良好");
	   break;
   case 3:
	   System.out.println("中等");
	   break;
   case 2:
   case 1:
   case 0:
	   System.out.println("不及格");
	   break;
	   
	   
   
   }
 }
}