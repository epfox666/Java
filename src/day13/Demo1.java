package day13;
import java.util.*;
public class Demo1 {
public static void main(String[] args) {
	Map map=new HashMap();
	map.put("k1", "v1");
	map.put("谢霆锋", "张柏芝");
	map.put("卫青", "霍去病");
	System.out.println(map.size());
	System.out.println(map.isEmpty());
//	map.clear();
//	System.out.println(map.isEmpty());
	map.remove("k1");
	System.out.println(map.toString());
	System.out.println(map);
}
}
