package day03;

public class Demo3 {
	  public static void main(String[] args)
	  {
		int i = 100;
		int sum = i++ + ++i + i++;
	//301  303  304 
	//��1��i++�� 	   i++��100      i �� 101
	//��2��++i��          i�� 102        ++i��102
	//��3��i++��          i++��	102      i��103
		System.out.println("i ="+i);
		System.out.println("sum ="+sum);	
}
}

