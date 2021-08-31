package com.java.scanner1;

public class UpperCaseLowerCase {
	public static void main(String[] args) {
		String count="";
		
		String s="WelcomE";
count= count+s.substring(0, 1).toLowerCase() +s.substring(1, 6).toUpperCase()+s.substring(6).toLowerCase();
		System.out.println(count);
	}

}
