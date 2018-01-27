package day03;

public class Demo2 {
	 public static void main(String[] args)
	  {
		int i = 200;
		int sum = i++ + ++i + i++;
		
		System.out.println(sum);
    /*  i++=200 i=201
		i=201 ++i=202
		i++=202 i=203
		
  */
	  }
}
