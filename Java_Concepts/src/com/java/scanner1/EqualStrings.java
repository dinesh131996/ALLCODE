package com.java.scanner1;

import java.util.Scanner;

public class EqualStrings {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	
	String next = scan.next();
	System.out.print("password");
	
	String next1 = scan.next();
	System.out.println("confirm password"+next1);
	
	if(next.equals(next1))
	{
		System.out.println("password correct");
	}
	else {
		System.out.println("password incorrect");
	}
	
	scan.close();
	
}
	
	
	
}
