package com.java.scanner1;


public class MutableImmutable {

	public static void java1() {

		String s = new String("greens");
		String s1 = new String("greens");
		System.out.println(System.identityHashCode(s));
		System.out.println(s);
		System.out.println(s1);
		s.concat(s1);
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

	}

	public static void main(String[] args) {
		// java1();
		java2();

		char ch = 'a';
		char ch2 = 'A';
		int ascii = ch;
		int ascii1 = ch2;
		System.out.println(ascii);
		System.out.println(ascii1);

	}

	public static void java2() {
		StringBuffer b = new StringBuffer("Welcome");

		StringBuffer append = b.append("home");
		System.out.println(append);
		// if we want to add the string to the existing string

		StringBuffer insert = b.insert(1, "elc");
		System.out.println(insert);
		//if u wan to insert any string choose the index where to insert
		
		StringBuffer delete = b.delete(0, 3);
		System.out.println(delete);
		//if u want to delete some content in the given string using delete
		
		StringBuffer deleteCharAt = b.deleteCharAt(1);
		System.out.println(deleteCharAt);
		//particular index of char u wan to delete means using this keyword

		StringBuffer reverse = b.reverse();
		System.out.println(reverse);
		//its only reverse the given string

		StringBuffer replace = b.replace(0, 1, "welcome");
		System.out.println(replace);
		//replace the string from where to where
		
		int length = b.length();
		System.out.println(length);
		//to know the length of the string

		String substring = b.substring(2);
		System.out.println(substring);
		//the remaining part of string will print 0to1 index is deleted automatically 
		int indexOf = b.indexOf("Welcome");
		System.out.println(indexOf);

		char charAt = b.charAt(2);
		System.out.println(charAt);
		//to know the char in particular index
		
		CharSequence subSequence = b.subSequence(1, 3);
		System.out.println(subSequence);
		//To know the char from which index to which index

	}

}
