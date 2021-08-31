package org.progrmsjava;

public class Triangulation_Program {
public static void main(String[] args) {
	int num=4;
	int num1=1;
	for (int i = 5; i >=1; i++) {
		for (int j = 1; j <=num; j++) {
			System.out.print(" ");
		}
		for (int j =i; j <=num1; j++) {
			System.out.print(j);
		}
		System.out.println();
		num--;
		num1=num1+2;
	}
	
	
	
	
}
}
