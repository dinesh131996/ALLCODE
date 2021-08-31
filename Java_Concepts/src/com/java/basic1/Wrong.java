package com.java.basic1;

import com.java.basic.OverRiding1;

public class Wrong extends OverRiding1 {
	public void muscle(String j) {
		super.muscle("22kgs");
		System.out.println("my new new weight is " + j);
	}

	public static void main(String[] args) {
		OverRiding1 jj = new Wrong();
		jj.muscle("66");
	}
}
