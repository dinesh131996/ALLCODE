package com.java.basic;

public class Method_Overloading {
	public void employee() {
	System.out.println(1);
	}
	public void employee(char a)
	{
		System.out.println("my name is: " +a);
	}
	public void employee(int c, int b) {
		System.out.println("salary is: " +c);
		System.out.println("particular id num is: " +b);
	}
	public static void main(String[] args) {
		Method_Overloading input = new Method_Overloading();
		input.employee();
		input.employee('a');
		input.employee(12000, 235);

}
}
