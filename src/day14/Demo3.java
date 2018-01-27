package day14;
import java.util.*;
import java.text.*;
public class Demo3 {
public static void main(String[] args) {
	Date date=new Date();
	System.out.println(date);
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
	String message=sdf.format(date);
	System.out.println(message);
}
}
