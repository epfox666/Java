package day10;

public class Demo9 {
	  public static void main(String[] args){
		Koo2 k2 = new Koo2();
		k2.f1(10, 10);
	  }
	}
	//this.方法名（参数）：调用本类中的其他的方法
	//super.方法名（参数）：在子类中调用父类中被覆盖
	//方法
	class Koo1{//父类
	  int function(int num1,int num2){//加法
		int sum = num1 + num2;
		return sum;
	  }
	}
	class Koo2 extends Koo1{//子类
	//重写父类中的function
	  int function(int num1,int num2){//乘法
		int result = num1 * num2;
		return result;
	  }
	//设计方法：（num1+num2）+num1*num2 
//	        父类function  子类重写function
//	        super.方法          this.方法
	  void f1(int num1,int num2){
		int result = 
	super.function(num1,num2)+
	              this.function(num1, num2);
		System.out.println("结果是"+result);
	  }
	}
