package org.progrmsjava;

public class reverseEachWord {
	public static void main(String[] args) {
		String s = "Welcome to the java";
		// First apporoach

		String[] sp = s.split(" ");
		String rev = "";
		for (String a : sp) {
			/*
			 * for (int i = a.length()-1; i >=0; i--) { rev+=s.charAt(i); }
			 */
			System.out.println(a);
			// String re="";
			for (int i = a.length() - 1; i >= 0; i--) {
				rev += a.charAt(i);
			}
			// rev+=rev+" ";
			rev += " ";
		}
		System.out.println(rev);

		// second apporach

		String rever = "";

		for (int i = sp.length - 1; i >= 0; i--) {
			String Str = sp[i];
			System.out.println(Str);

			for (int j = Str.length() - 1; j >= 0; j--) {
				rever += Str.charAt(j);

			}
			rever += " ";

		}
		System.out.println(rever);
		
		int count=0;
		
		for (String string : sp) {
			count++;
		}
		System.out.println(count);
	}
}
