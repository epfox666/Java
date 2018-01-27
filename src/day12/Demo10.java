package day12;
import java.util.*;
public class Demo10 {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add("epfox");
	list.add(123);
	list.add(false);
	String name=(String)list.get(0);
	System.out.println(name);
	int num=(int)list.get(1);
	System.out.println(num);
	boolean f=(boolean)list.get(2);
	System.out.println(f);
	System.out.println(list.toString());
}
}
