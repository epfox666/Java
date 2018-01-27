package day13;

public class Demo6 {
public static void main(String[] args) {
	 String str1=new String("温柔的月光");   //构造方法
	 String str2= "温柔的月光";
//	 System.out.println(str1);
//	 System.out.println(str2);
//	 System.out.println(str1.toString());
//	 System.out.println(str1.equals(str2));
   //  int[] arr={1,2};
   //  int[] arr=new int[2];	 
	char[] array=str2.toCharArray();  //字符串转换字符数组
	for(char c:array) {
		System.out.println(c);
	}
	 String str3="Epfox";
	 String str4=str3.toUpperCase(); //大写
	 System.out.println(str4);
	 
	 String str5="EPFOx";
	 String str0=str5.toLowerCase(); //小写
	 System.out.println(str0);
	 
	 String str6="今天阴云密布，明天春暖花开";
	 String str7=str6.substring(7);
	 System.out.println(str7);
	 
	 String str8=str6.substring(7, 9);
	 System.out.println(str8);
	 String str9=str6.substring(2,6);
	 System.out.println(str9);
	 
	 String str10=
				"     落霞与孤鹜齐飞     秋水共长天一色";
	 System.out.println(str10);
	 String str11=str10.trim();  //去首空格
	 System.out.println(str11);
	 
	 String str=
				"这一路走来，你若懂我，该有多好";
	 char c1=str.charAt(7);
	 System.out.println(c1);
}
}
