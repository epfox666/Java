//带参数无返回值
package day07;

public class Demo13 {
static void update(int num1) {
	num1=num1-1;
	System.out.println("形参num1="+num1);
}
public static void main(String[] args) {
	int num=20;
	update(num);
	System.out.println("实参num="+num);
}
}
