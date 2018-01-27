package day11;

public class Demo6 {
public static void main(String[] args) {
	Worker w1 = new Worker("卫青",32);
	Worker w2 = new Worker("项羽",34);
	Worker w3 = new Worker("蓝玉",36);
	Worker w4 = new Worker("黄汉升",33);
	Worker w5 = new Worker("甘兴霸",32);
	Worker w6 = new Worker("秦琼",36);
	Worker.getMoney();
}
}
class Worker{
	String name;
	int age;
	static int num=0;
	Worker(String name,int age){
		this.name=name;
		this.age=age;
		num++;
	}
	static void getMoney() {
		double result=num*10000;
		System.out.println("总的工资支出："+result);
	}
}
