package day14;

public class Demo8 {
public static void main(String[] args) {
	try {
		String str="sfsfsfdsf";
		str.charAt(6);
	}catch(NullPointerException e) {
		e.printStackTrace();
	}finally {
		System.out.println("不管有没有异常出现，都必须执行的代码");
	}
}
}
