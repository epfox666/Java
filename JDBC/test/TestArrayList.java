package com.tarena.test;
import java.util.*;
public class TestArrayList {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add(123);
	list.add("epfox");
	list.add(new Student("epfox",1));
	list.add(new Emp("Tom",2));
	Student s1=(Student) list.get(2);
	System.out.println(s1);
	System.out.println(list.get(2));
//	for(int i=0;i<list.size();i++) {
//		System.out.println(list.get(i));
//	}
	
	
	
	}
}
class Student{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public static Student get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
class Emp{
	String name;
	int age;
	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}
	
}
