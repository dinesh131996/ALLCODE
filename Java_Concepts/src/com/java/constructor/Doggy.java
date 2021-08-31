package com.java.constructor;

public class Doggy extends Megala {
	public Doggy(int a, int b)
	{
		super('m');
		
		System.out.println("doggy go"+a);
		System.out.println("doggy new go"+b);
	}
	public Doggy() {
		super(585);
		
System.out.println("doggy none");
	}
	public Doggy(String n){
		super("juke");
	System.out.println("my doggy name is "+n);
	}
	public static void main(String[] args) {
		/*Doggy kk = */new Doggy(22, 33);
		/*Doggy ll = */new Doggy();
		/* Doggy oo = */ new Doggy("rosy");	}

}
