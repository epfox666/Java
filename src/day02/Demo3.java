package day02;

import java.math.BigDecimal;

public class Demo3 {
	public static void main(String[] args) {
		
 // long d=(int)10;
  double a=(float)12.12;
  //double b=100;
  int c=(int)12.9;
 
  float f = 127.1f;
  BigDecimal b = new BigDecimal(Float.toString(f));
  double d = b.doubleValue();
  System.out.println(d);
    
    
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);
  //System.out.println(e);
	}
}
