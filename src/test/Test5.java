package test;

public class Test5 {
	    public static void main(String[] args){
	        Test5 pk=new Test5();
	        //String类似基本类型，值传递，不会改变实际参数的值
	        String test1="Hello";
	        pk.change(test1);
	        System.out.println(test1);	         
	        //StringBuffer和StringBuilder等是引用传递
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