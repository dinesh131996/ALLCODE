package com.java.scanner1;

public class ReplaceVowels {
	public static void main(String[] args) {
		String count = "";
		String s = "Welcome";
		char[] ch = new char[s.length()];
		for (int i = 0; i <= 6; i++) {
			switch (s.charAt(i)) {
			case 'e':
				count = s.replace('e', '@');
			break;

			case 'm':
				count = count + s.replace('m', '@');
				break;

			default:
				count=count;
				break;

			}

		}
		System.out.println(count);

	}

}
