package org.progrmsjava;

public class Manipulation_Program {
public static void main(String[] args) {
	String s= "welcome to Java12156486@$@%$^%^%&8";
	//String[] split = s.split("");
	int count=0;
	int count2=0;
	int count1=0;
	int count3=0;
	for (int i = 0; i <s.length(); i++) {
		if(s.charAt(i)>=97&& s.charAt(i)<=122) {
			count++;
		}
		else if (65<=s.charAt(i)&&s.charAt(i)<=90) {
			count1++;
		}else if(48<=s.charAt(i)&& s.charAt(i)<=57) {
			count2++;
		}else {
			count3++;
		}
	}System.out.println(count);
	System.out.println(count2);
	System.out.println(count1);
	System.out.println(count3);
	System.out.println(s.length()-count-count1-count2-count3);
}
}
