package com.java.classbelownewclass;



public class ClassBelowNewClass {

	public static class Employee {
		public static void boy() {
			// TODO Auto-generated method stub
System.out.println("boy");
		}

		public static void girl() {
			// TODO Auto-generated method stub
			System.out.println("girl");	
		}
	}

	public static void main(String[] args) {
		Employee.boy();
		Employee.girl();
		
		Memory ll = new Memory();
		ll.gear();
	}

}
abstract class Name{
	public void volvo() {
		// TODO Auto-generated method stub
System.out.println("volvo car");
	}
	public void gaget() {
		// TODO Auto-generated method stub
System.out.println("gaget is ios");
	}
	public abstract void gear(); 
		
	
}
class Memory extends Name{

	public void gear() {
		// TODO Auto-generated method stub
	System.out.println("gear type is");	
	}
	
	
}