package com.java.loop;
public class For2 {
	

	public static void main(String[] args) {
		int a=1;
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <=a; j++) {
				System.out.print(j);
			}
			System.out.println();
			a=a+2;
		}
	}
		
	}
