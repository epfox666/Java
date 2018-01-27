package test;

import java.util.*;

public class Test13 {
	public static void main(String[] args) {
		List list=new ArrayList();
		Cost cost=new Cost();
		list.add(new Cost("epfox1",12));
		list.add(new Cost("epfox2",13));
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}

   
}

class Cost{
	String name;
	int age;
	public Cost() {
		super();
	}
	public Cost(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cost [name=" + name + ", age=" + age + "]";
	}
	
}
