package org.progrmsjava;

import java.util.Scanner;

public class TernaryOperator {
public static void main(String[] args) {
	 
	
	Scanner sc = new Scanner(System.in);
	double nextDouble = sc.nextDouble();
	String result = (nextDouble>40)?"pass":"fail";
	
    System.out.println(result);
}
}
