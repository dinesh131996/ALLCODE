package org.progrmsjava;

public class Replace {
public static void main(String[] args) {
	String s="welcoe to the java";
	String[] split = s.split("");
	String count="";
	for (int i = 0; i < split.length; i++) {
		switch (split[i]) {
		case " ":
			count=count+'#';
			break;

		default:
			count=count+split[i];
			break;
		}
	}System.out.println(count);
	}
}