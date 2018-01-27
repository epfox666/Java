package day05;

public class Demo14 {
	  public static void main(String[] args) {
			 int i=1,sum=0; 
			do { 
				if(i%2==0) {
					sum=sum+i;					
				}
				i++;
			}while(i<=100);
			System.out.println(sum);
		}
		}