package math;


public class Test2 {
public static void main(String[] args) {
	int[] a= {6,5,4,3,2,1};
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}	
	for(int j=0;j<a.length-1;j++) {
		for(int i=0;i<a.length-1-j;i++) {
			if(a[i]>a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	}
	System.out.println();
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	

	
	
}
}
