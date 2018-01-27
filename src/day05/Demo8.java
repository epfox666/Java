package day05;

public class Demo8 {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		int res=0;
		while(i<=100) {
			if(i%2==0) {
			sum=sum+i;
			}
			else {
			res=res+i;
			}
			i++;
		}
		System.out.println(sum);
		System.out.println(res);
	}
	}