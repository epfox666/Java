package friend1;

public class Demo4 {

}


class Student2 extends Student{
	public int add() {
//		 return num1+num2+num3+num4;
//		 num1是私有的，外界无法访问
		 return num2+num3+num4;
	}
}
