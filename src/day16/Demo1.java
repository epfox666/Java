package day16;

public class Demo1 {
public static void main(String[] args) {
	//8�ֻ����������Ͷ���ת����
	Integer integer1=new Integer(12);
	int num1=integer1.intValue();
	//8�ֻ���������������ת����
	int num2=25;
	Integer integer2=Integer.valueOf(num2);
	//String����ת�ַ���
	Integer integer3=new Integer(35);
	String str1=integer3.toString();
	//String  �ַ���ת����
	String str2="epfox";
	String integer4=String.valueOf(str2);
	//String �ַ���ת����(int)
	String str3="123456";
	int num3=Integer.parseInt(str3);
}
}
