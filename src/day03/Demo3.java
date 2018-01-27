package day03;

public class Demo3 {
	  public static void main(String[] args)
	  {
		int i = 100;
		int sum = i++ + ++i + i++;
	//301  303  304 
	//第1个i++： 	   i++：100      i ： 101
	//第2个++i：          i： 102        ++i：102
	//第3个i++：          i++：	102      i：103
		System.out.println("i ="+i);
		System.out.println("sum ="+sum);	
}
}

