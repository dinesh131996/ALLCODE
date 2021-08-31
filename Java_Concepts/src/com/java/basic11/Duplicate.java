package com.java.basic11;

public class Duplicate extends Mob {
	public void duke() {
		// TODO Auto-generated method stub
		super.duke();
		System.out.println("mob duke");
	}
public void samsung() {
	// TODO Auto-generated method stub
	super.samsung();
	System.out.println("mob samsung");

}
public void lava() {
	// TODO Auto-generated method stub
	super.lava();
	System.out.println("lava lava");

}
public static void main(String[] args) {
	Mob dd = new Duplicate();
	dd.duke();
	dd.lava();
	dd.samsung();
}

}
