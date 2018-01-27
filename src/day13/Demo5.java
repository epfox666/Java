package day13;
import java.util.*;
public class Demo5 {
public static void main(String[] args) {
	HashSet set=new HashSet();
	set.add("你好");
	set.add(new User("Tom",23));
	set.add(new User("James",24));
	System.out.println(set.toString());
	User user=new User("James",24);
	set.remove(user);
	System.out.println(set.toString());
    System.out.println(set.isEmpty());
    System.out.println(set.size());
	
}
}
