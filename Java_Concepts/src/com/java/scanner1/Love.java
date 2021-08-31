package com.java.scanner1;

public class Love {
 public void cake() {
System.out.println("love");
	}
	public static void main(String[] args) {
		String s="Welcome to the class";
		
	 char c = s.charAt(6);
	 System.out.println(c);
		
	 boolean contains = s.contains(" to");
	 System.out.println(contains);
	 
	 boolean equals = s.equals(s);
	 System.out.println(equals);
	 
	 boolean equalsIgnoreCase = s.equalsIgnoreCase("welcome to the class");
	 System.out.println(equalsIgnoreCase);
	 
	 boolean startsWith = s.startsWith("welcom");
	 System.out.println(startsWith);
	 
	 boolean endsWith = s.endsWith("lass");
	 System.out.println(endsWith);
	 
	 int indexOf = s.indexOf('e');
	 System.out.println(indexOf);
	 
	 int lastIndexOf = s.lastIndexOf('s');
	 System.out.println(lastIndexOf);
	 
	 
	 
	 
	}
	
}