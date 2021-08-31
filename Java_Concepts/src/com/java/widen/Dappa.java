package com.java.widen;

public class Dappa {
final static int a=100;
	public void look() {
System.out.println("looking attractive");
	}
public final void employeeName() {
	System.out.println("employye  name is dinesh");

}
public void employeeeId() {
	System.out.println("my id is 1223");

}
public static void main(String[] args) {
	
	final int b=100;
	Dappa k = new Dappa();
	k.employeeeId();
	k.employeeName();
	k.look();
	System.out.println(a);
	System.out.println(b);
}


}
