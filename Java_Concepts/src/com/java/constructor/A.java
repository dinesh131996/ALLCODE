package com.java.constructor;

public class A extends B{
public A() {
	super('m');
System.out.println("Default const...");
}
public A(char f)
{
	System.out.println(f);
}
public void amul() {
	// TODO Auto-generated method stub
System.out.println("amul milkshake is very gd");
}
public void king() {
	// TODO Auto-generated method stub
System.out.println("monarch king");
}

public static void main(String[] args) {
A a = new A();
a.amul();
A b = new A('d');
b.king();
}
}

