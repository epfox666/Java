package day13;

public class Demo6 {
public static void main(String[] args) {
	 String str1=new String("������¹�");   //���췽��
	 String str2= "������¹�";
//	 System.out.println(str1);
//	 System.out.println(str2);
//	 System.out.println(str1.toString());
//	 System.out.println(str1.equals(str2));
   //  int[] arr={1,2};
   //  int[] arr=new int[2];	 
	char[] array=str2.toCharArray();  //�ַ���ת���ַ�����
	for(char c:array) {
		System.out.println(c);
	}
	 String str3="Epfox";
	 String str4=str3.toUpperCase(); //��д
	 System.out.println(str4);
	 
	 String str5="EPFOx";
	 String str0=str5.toLowerCase(); //Сд
	 System.out.println(str0);
	 
	 String str6="���������ܲ������촺ů����";
	 String str7=str6.substring(7);
	 System.out.println(str7);
	 
	 String str8=str6.substring(7, 9);
	 System.out.println(str8);
	 String str9=str6.substring(2,6);
	 System.out.println(str9);
	 
	 String str10=
				"     ��ϼ��������     ��ˮ������һɫ";
	 System.out.println(str10);
	 String str11=str10.trim();  //ȥ�׿ո�
	 System.out.println(str11);
	 
	 String str=
				"��һ·�������������ң����ж��";
	 char c1=str.charAt(7);
	 System.out.println(c1);
}
}
