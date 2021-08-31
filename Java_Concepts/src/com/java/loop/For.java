package com.java.loop;

public class For {
	public static void main(String[] args) {
		
		
		int odd=1;
		  int size=4; 
		  int noOfSpace=size-1;
		 
		
		for (int i = 1; i <=size; i++) {
			int k=0;
			for (int j = 1; j <=noOfSpace; j++) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <=odd; j++) {
				if(j<=i) {
					k=k+1;
					System.out.print(k);
				}
				else {
					k=k-1;
				System.out.print(k);
				}
			}
			System.out.println();
			odd=odd+2;
			noOfSpace=noOfSpace-1;
		}
	}
}
