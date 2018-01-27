package day02;
public class Demo2 {
//自动类型转化：由小到大
//byte-》short-》int-》long-》float-》double
  public static void main(String[] args)
  {
	int numInt = 100;
	float numFloat = numInt;
//numInt会自动类型转化，由int类型自动转化为float
//类型
	System.out.println("numFloat = "
			+numFloat);	
  }
	
}
