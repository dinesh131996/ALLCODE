package com.java.whiledowhile;

public class ReversePattern {
	public static void main(String[] args) {
		int odd = 1; 
		int size= 10;
		int noOfSpaces=size-1;
		for (int i = 1; i <=size; i++) {
			int k=0;
			for (int j = 1; j <=noOfSpaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= odd; j++) {
				
				if(j<=i) {
				k=k+1;
			}
			else {
				k=k-1;
			}
			System.out.print(k);
			}
			System.out.println();
			odd = odd + 2;
			noOfSpaces= noOfSpaces-1;
		
		}
	}
}

//if (k<=j) {
//System.out.println(k);
//}
//else
//k=k-1;
// System.out.println(k);

//System.out.println();