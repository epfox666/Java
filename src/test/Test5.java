package test;

public class Test5 {
	    public static void main(String[] args){
	        Test5 pk=new Test5();
	        //String���ƻ������ͣ�ֵ���ݣ�����ı�ʵ�ʲ�����ֵ
	        String test1="Hello";
	        pk.change(test1);
	        System.out.println(test1);	         
	        //StringBuffer��StringBuilder�������ô���
	        StringBuffer test2=new StringBuffer("Hello");
	        pk.change(test2);	         
	        System.out.println(test2.toString());
	    }	     
	    public void change(String str){
	        str=str+"world";
	      //  System.out.println(str);
	    }	     
	    public void change(StringBuffer str){
	        str.append("world");
	    }
	}