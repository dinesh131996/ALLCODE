package org.progrmsjava;

public class Count_the_Char {
public static void main(String[] args) {
	String s="welcome to the class";
	String[] split = s.split("");
	int count=0;
	for (String string : split) {
		count++;
		//System.out.println(string);
		if(string.equalsIgnoreCase("s")) {
			count=count-1;
		}
	}System.out.println(count);
}
}
