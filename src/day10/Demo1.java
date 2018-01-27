package day10;

public class Demo1 {
public static void main(String[] args) {
	Foo4 f=new Foo4();
	System.out.println(f.f1);
	System.out.println(f.f2);
	System.out.println(f.f3);
	System.out.println(f.f4);
}
}

class Foo1{
	int f1=11;
}
class Foo2 extends Foo1{
	int f2=12;
}
class Foo3 extends Foo2{
	int f3=13;
}
class Foo4 extends Foo3{
	int f4=14;
}
