package day13;
import java.util.*;
public class Demo1 {
public static void main(String[] args) {
	Map map=new HashMap();
	map.put("k1", "v1");
	map.put("Ğ»öª·æ", "ÕÅ°ØÖ¥");
	map.put("ÎÀÇà", "»ôÈ¥²¡");
	System.out.println(map.size());
	System.out.println(map.isEmpty());
//	map.clear();
//	System.out.println(map.isEmpty());
	map.remove("k1");
	System.out.println(map.toString());
	System.out.println(map);
}
}
