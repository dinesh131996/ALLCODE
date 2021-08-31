package com.java.basic11;

public class Mob implements Mobile {
	public void samsung() {
		// TODO Auto-generated method stub
	System.out.println(" samsung mob");	
	}
	public void duke() {
		// TODO Auto-generated method stub
		System.out.println("duke mob");		
	}
	public void lava() {
		// TODO Auto-generated method stub
		System.out.println(" lava mob");	
	}
	public static void main(String[] args) {
		Mobile kk = new Mob();
		kk.duke();
		kk.lava();
		kk.samsung();
	}

}
