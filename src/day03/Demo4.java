package day03;

public class Demo4 {
public static void main(String[] args) {
	int i= 100;
	int sum = ++i + --i + i-- + i++;
	System.out.println(sum);
}
}


// i=101 ++i=101
// i=100 --i=100
// i--=100 i=99
// i++=99 i=100
