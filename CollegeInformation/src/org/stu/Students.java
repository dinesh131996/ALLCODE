package org.stu;

import java.util.LinkedHashMap;
import java.util.Map;

public class Students {
	public void stuName(String c) {
		System.out.println("Student name is:" + c);
	}
	public void stuId(int c) {
		System.out.println("Student ID is:" + c);
	}
	public void stuDept(String c) {
		System.out.println("Student dept is:" + c);
	}
	public static void main(String[] args) {
		Students ll= new Students();
		ll.stuDept("ss");
		ll.stuId(123);
		ll.stuName("hii");
	}
}



class Gopi{
	public void go() {
System.out.println("gopi");
	}
	
	public static void main(String[] args) {
		Gopi l = new Gopi();
		l.go();
		
		//System.out.println("gopi");
	}
}































