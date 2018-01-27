package test;
import java.util.*;
public class Test12 {
public static void main(String[] args) {
	List list =new ArrayList();
	list.add(12);
	list.add(12);
	System.out.println(list.get(0));
	System.out.println(list.get(1));
	System.out.println(list.get(0)==list.get(1));
}
}
