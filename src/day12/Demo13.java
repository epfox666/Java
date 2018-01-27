package day12;
import java.util.*;
public class Demo13 {
public static void main(String[] args) {
	HashMap map=new HashMap();
	map.put("k1", "v1");
	map.put("貂蝉","吕布");
	System.out.println(map.toString());
	map.put("k3",new Customer(1,"谢安"));
	map.put("k4",new Emp2("房玄龄",23,"fang@163.com"));
	System.out.println(map);
	System.out.println(map.isEmpty());
	String k1=(String)map.get("k1");
	System.out.println(k1);
	String lvbu=(String)map.get("貂蝉");
	System.out.println(lvbu);
	Customer c=(Customer)map.get("k3");
	System.out.println(c.id);
	System.out.println(c.name);
	Emp2 e=(Emp2)map.get("k4");
	System.out.println(e.name);
	System.out.println(e.age);
	System.out.println(e.email);
	map.clear();
	System.out.println(map.size());
	System.out.println(map.isEmpty());
	map.put("貂蝉", "哥的");
	String name2 =(String)map.get("貂蝉");
	System.out.println("美女是："+name2);
	System.out.println(map);
}
}
class Customer{
	int id;
	String name;
	Customer(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Emp2{
	String name;
	int age;
	String email;
	Emp2(String name,int age,String email){
		this.name=name;
		this.age=age;
		this.email=email;
	}
}
