package org.progrmsjava;

public class Clll {
public static void main(String[] args) {
String s= "Welcome to java";
String[] split = s.split(" ");
String rev="";
System.out.println(s.length());
System.out.println(s.charAt(6));
for (int i =0 ; i <split.length; i++) {	
	String string = split[i].toString();
	for (int j = string.length()-1; j >=0 ; j--) {
		rev+=string.charAt(j);
	}
}
System.out.println(rev);

}
}
