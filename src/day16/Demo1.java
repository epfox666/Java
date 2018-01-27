package day16;

public class Demo1 {
public static void main(String[] args) {
	//8种基本数据类型对象转数字
	Integer integer1=new Integer(12);
	int num1=integer1.intValue();
	//8种基本数据类型数字转对象
	int num2=25;
	Integer integer2=Integer.valueOf(num2);
	//String对象转字符串
	Integer integer3=new Integer(35);
	String str1=integer3.toString();
	//String  字符串转对象
	String str2="epfox";
	String integer4=String.valueOf(str2);
	//String 字符串转数字(int)
	String str3="123456";
	int num3=Integer.parseInt(str3);
}
}
