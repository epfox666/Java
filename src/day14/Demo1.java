package day14;

public class Demo1 {
public static void main(String[] args) {
	String str1="那些年我们追过的女孩,紫川,三国志,红楼梦";
	String[] strs=str1.split(",");   //分割
	for(String str:strs) {
		System.out.println(str);
	}
	String str2="构造方法.bmp";   //以字符串结尾
	System.out.println(str2.endsWith(".bmp"));
	
	String str3="终于快下课了"; //以字符串开头
	System.out.println(str3.startsWith("终于"));
	
	String str4="今天是java的第14天";
	System.out.println(str4.indexOf('a'));
	System.out.println(str4.lastIndexOf('a'));
	
	String str5="liuyingqianliu";
	System.out.println(str5.indexOf("liu"));
	System.out.println(str5.lastIndexOf("liu"));
	
	System.out.println(str5.length());
	
	String num="b";
	int index="0123456789".indexOf(num);
	if(index==-1) {
		System.out.println("不是数字");
	}else {
		System.out.println("是数字");
	}
}
}
