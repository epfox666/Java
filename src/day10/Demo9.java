package day10;

public class Demo9 {
	  public static void main(String[] args){
		Koo2 k2 = new Koo2();
		k2.f1(10, 10);
	  }
	}
	//this.�������������������ñ����е������ķ���
	//super.�����������������������е��ø����б�����
	//����
	class Koo1{//����
	  int function(int num1,int num2){//�ӷ�
		int sum = num1 + num2;
		return sum;
	  }
	}
	class Koo2 extends Koo1{//����
	//��д�����е�function
	  int function(int num1,int num2){//�˷�
		int result = num1 * num2;
		return result;
	  }
	//��Ʒ�������num1+num2��+num1*num2 
//	        ����function  ������дfunction
//	        super.����          this.����
	  void f1(int num1,int num2){
		int result = 
	super.function(num1,num2)+
	              this.function(num1, num2);
		System.out.println("�����"+result);
	  }
	}