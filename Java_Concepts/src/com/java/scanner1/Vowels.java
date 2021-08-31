package com.java.scanner1;

public class Vowels {

	public static void main(String[] args) {
		int count1 = 0;
		int count2 = 0;

		String s = "Welcomealfefajkfadas";
		for (int i = 0; i <= 15; i++) {
			switch (s.charAt(i)) {
			case 'a':
				count1 = count1 + 1;
				break;
			case 'e':
				count1 = count1 + 1;
				break;
			case 'i':
				count1 = count1 + 1;
				break;
			case 'o':
				count1 = count1 + 1;
				break;
			case 'u':
				count1 = count1 + 1;
				break;

			default:
				count2 = count2 + 1;
				break;
			}

		}
		System.out.println(count2);
	}
}
