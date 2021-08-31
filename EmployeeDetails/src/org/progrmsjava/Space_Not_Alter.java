package org.progrmsjava;

import java.util.Iterator;

public class Space_Not_Alter {
public static void main(String[] args) {
	String s = "Welcome to the java";
	String rev="";
	for (int i = s.length()-1; i >=0 ; i--) {
		if (s.charAt(i)==' ') {
			System.out.println(s.indexOf(s.charAt(i)));
		}else {
			rev+=s.charAt(i);
		}
	}

	String str="";
	for (int i = 0; i <rev.length(); i++) {
		if(i<=6) {
			str+=rev.charAt(i);
		}
		else if (i==7||i==9||i==12) {
				str+=" "+rev.charAt(i);
			}else {
				str+=rev.charAt(i);
			}
	}
	
	System.out.println("original String :"+s);
	System.out.println("converted string:"+str);
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * char [] cha = new char[s.length()];
	 * 
	 * for (int i = 0; i < s.length(); i++) { if (s.charAt(i)==' ') { cha[i]=' '; }
	 * } for (int i = 0; i < cha.length; i++) {
	 * 
	 * }
	 */

	
	
	
	
	/*char[] cha = new char[split.length+3];
	
	for (int i = 0; i < cha.length; i++) {
		if (s.charAt(i)==' ') {
			cha[i]=' ';
		}
	}
	
	for (int i = 0; i < cha.length; i++) {
		if (cha[i]!=' ') {
			cha[i]=split[i].;
		}
	}
	
	
	String rev="";
	for (int i = s.length()-1; i >=0; i--) {
		rev=rev+s.charAt(i);
	}
	
	System.out.println(rev);
	
	char[] charArray2 = s.toCharArray();
	//char[] cha = new char[charArray2.length];
	
	for (int i = 0; i < cha.length; i++) {
		if (charArray2[i]==' ') {
			cha[i]=' ';
		}*/
	/*
	 * } for (int i = cha.length-1; i <=0; i--) { if (cha[i]!=' ') {
	 * 
	 * } } for (int i = 0; i < cha.length; i++) { System.out.print(cha[i]); }
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * String rev1=""; for (int i = s.length()-1; i>=0; i--) { if (s.charAt(i)==' ')
	 * { rev1+=" "; }else { rev1=rev1+s.charAt(i); }
	 * 
	 * }System.out.println(rev1);
	 * 
	 * char[] charArray = s.toCharArray();
	 * 
	 * char[] cha = new char[charArray.length]; for (int i = 0; i <
	 * charArray.length; i++) { if(charArray[i]==' ') { cha[i]=' '; } } for (int i =
	 * 0; i < cha.length; i++) { if (cha[i]!=' ') {
	 * 
	 * } } for (int i = 0; i < cha.length; i++) { System.out.print(cha[i]); }
	 */
}

}
