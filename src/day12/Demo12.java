package day12;
import java.util.*;
public class Demo12 {
	public static void main(String[] args) {
  List list=new ArrayList();
  list.add(new Person2("epfox"));  //0
  list.add(new User2("fox",18));   //1
  list.add(new User2("ep",20));    //2
  System.out.println(list.size());
 // System.out.println(list.isEmpty());
//  Person2 p=(Person2)list.get(0);
//  System.out.println(p.name);
//  User2 u1=(User2)list.get(1);
//  System.out.println(u1.name);
 // System.out.println(u1.age);
  list.remove(1);
  User2 u1=(User2)list.get(1);
  System.out.println(u1.name);
  System.out.println(u1.age);
  System.out.println(list.size());
  System.out.println(list.toString());
  
	}
}
