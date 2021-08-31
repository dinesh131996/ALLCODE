package org.progrmsjava;

interface aa {
	//void gear();
	
	void gear(int c);
}

public class LambadaExpressionn {
	public static void main(String[] args) {
		aa a;

	//	a = () -> {
		a = (c) -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
			}
			System.out.println("dinesh"+c);
		};

		//a = () -> System.out.println("dinesh");

		//a.gear();
		a.gear(2);

	}
}
