package com.java.basic;

public class OverRiding1 extends OverRiding {

	public void muscle(String j) {
		super.muscle("24kgs");
		System.out.println("my new weight is " + j);
	}

	public static void main(String[] args) {
		OverRiding hh = new OverRiding1();
		hh.muscle("55kgs");
	}

}
