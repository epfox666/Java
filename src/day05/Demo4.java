package day05;

public class Demo4 {
	public static void main(String[] args) {
		  int i=3000;
		   while(i>0) {
			if((i%4==0&&i%100!=0)|| i%400==0) {
				System.out.println(i);
			}
			i--;
		   }
	}
 
}
