package day06;

public class Demo10 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=300;i=i+1) {
			if(i%2==0) {
				sum=sum+i;
			}
		
		}
		System.out.println(sum);
	}
}

