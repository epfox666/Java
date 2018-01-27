package friend2;
import friend1.Student;
public class Demo5 {
public static void main(String[] args) {
	Student s1=new Student();
	s1.num4=2;
	//s1.num2=2;
}
}
class Student3 extends Student{
	public int add() {
		return num2+num4;
	}
}
