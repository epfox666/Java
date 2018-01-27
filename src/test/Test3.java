package test;

import java.util.Date;

public class Test3 {
public static void main(String[] args) {
Date a,b; //在内存开辟两个引用空间
a = new Date();//开辟存储Date对象的数据空间，并把该空间的首地址赋给a
b = a; //将a存储空间中的地址写到b的存储空间中
System.out.println(a.equals(b));
}
}
class Eoo{
	
}