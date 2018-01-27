package math;

public class Test1 {
public static void main(String[] args) {
	int[] a= {6,5,4,3,2,1};
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}	
	
	for(int j=0;j<a.length;j++) {
		for(int i=j+1;i<a.length;i++) {
			if(a[i]<a[j]) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	System.out.println();
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	
	
	
	
}
}
