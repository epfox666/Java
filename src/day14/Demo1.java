package day14;

public class Demo1 {
public static void main(String[] args) {
	String str1="��Щ������׷����Ů��,�ϴ�,����־,��¥��";
	String[] strs=str1.split(",");   //�ָ�
	for(String str:strs) {
		System.out.println(str);
	}
	String str2="���췽��.bmp";   //���ַ�����β
	System.out.println(str2.endsWith(".bmp"));
	
	String str3="���ڿ��¿���"; //���ַ�����ͷ
	System.out.println(str3.startsWith("����"));
	
	String str4="������java�ĵ�14��";
	System.out.println(str4.indexOf('a'));
	System.out.println(str4.lastIndexOf('a'));
	
	String str5="liuyingqianliu";
	System.out.println(str5.indexOf("liu"));
	System.out.println(str5.lastIndexOf("liu"));
	
	System.out.println(str5.length());
	
	String num="b";
	int index="0123456789".indexOf(num);
	if(index==-1) {
		System.out.println("��������");
	}else {
		System.out.println("������");
	}
}
}
