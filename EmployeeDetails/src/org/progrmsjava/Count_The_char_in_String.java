package org.progrmsjava;

public class Count_The_char_in_String {
public static void main(String[] args) {
	String s="welcome to the java";
	String[] split = s.split("");
int count=0;
for (String string : split) {
	
	count++;
}System.out.println(count
		);
}
}
