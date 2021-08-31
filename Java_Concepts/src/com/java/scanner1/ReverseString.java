package com.java.scanner1;

import java.util.Scanner;

//import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
       Scanner kk = new Scanner(System.in);
       String mm = kk.next();
	
       String s = mm;
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
		if (s.contains(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}