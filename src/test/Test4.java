package test;

public class Test4 {
	public static void main(String[] args) { 
        Test4 t = new Test4(); 
        int a=99; 
        t.test1(a);//这里传递的参数a就是按值传递 
        System.out.println(a);
         
        MyObj obj=new MyObj(); 
        
        t.test2(obj);//这里传递的参数obj就是引用传递
        System.out.println(obj.b);
    } 
     
    public void test1(int a){ 
        a=a++;
        System.out.println(a);
        } 
     
    public void test2(MyObj obj){ 
        obj.b=100;
        System.out.println(obj.b);
        }
}
class MyObj{
	int b;
}