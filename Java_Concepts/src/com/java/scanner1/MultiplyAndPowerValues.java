package com.java.scanner1;

import java.util.Iterator;
import java.util.Scanner;

public class MultiplyAndPowerValues {
	public static void main(String[] args) {
		
		Scanner t= new Scanner(System.in);
		int j = t.nextInt();
		for (int m = 1; m <=j ; m++) {
		int a= t.nextInt();
		int b = t.nextInt();
	int n = t.nextInt();
		/*
		 * int a=0; int b=2; int n=10;*/ int s=0;
		 
		for (int k = 0; k <=n-1; k++) {
			
				 s=s+(int)Math.pow(2, k)*b;
				System.out.print(s+a+" ");
				}
			System.out.println();	
	}

}
}