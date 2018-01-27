package day12;
import java.util.*;
public class Demo11 {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add("昨天天气不错，才36度"); //0
	list.add(new Person2("杨广"));  //1
	list.add(new User2("李靖",35));   //2
	list.add(new User2("李文静",32));   //3
	list.add("今天好累。。。终于可以不用写类了");  //4
	System.out.println(list.size());  //获取当前集合中元素个数
	User2 user1=(User2)list.get(3);   //类 对象名=（类）获取第四个
	System.out.println(user1.name);
	System.out.println(user1.age);
	System.out.println(list.isEmpty());
//	list.clear();
//	System.out.println(list.isEmpty());
//	String a=(String)list.get(0);
//	System.out.println(a);
	list.remove(0);
	Person2 p=(Person2)list.get(0);
	System.out.println(p.name);
	System.out.println(list.toString());
}
}
class Person2{
	String name;
	Person2(String name){
		this.name=name;
	}
}
class User2{
	String name;
	int age;
	User2(String name,int age){
		this.name=name;
		this.age=age;
	}
}
