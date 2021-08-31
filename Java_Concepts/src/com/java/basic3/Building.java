package com.java.basic3;

import com.java.iei.Social;

public class Building implements Social {

	public void boy(String a) {
		System.out.println("mother love" + a);

	}

	public void girl(String b) {
		System.out.println("boys love" + b);
	}

	public void children(int c) {
		System.out.println("girls love" + c);
	}

	public static void main(String[] args) {
		Building ll = new Building();
		ll.boy();
		ll.girl();
		ll.mother();
		ll.boy("Diensh");
		ll.girl("sugu");
		ll.children(2);
	}

	public void boy() {
		System.out.println("aaa");

	}

	public void girl() {
		System.out.println("bbb");
	}

	public void mother() {
		System.out.println("ccc");
	}

}