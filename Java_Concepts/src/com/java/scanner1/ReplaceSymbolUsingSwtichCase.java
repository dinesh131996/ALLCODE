package com.java.scanner1;

public class ReplaceSymbolUsingSwtichCase {

	public static void main(String[] args) {
		String count = "";
		String s = "welome welcome welcome welcome";
		int length = s.length();
		System.err.println(length);
		for (int i = 0; i <=29; i++) {
			
			//String count="";   //2nd method
			switch (s.charAt(i)) {

			case 'e' | 'E':
				count  += "@";
				//we may use this type also
				//instead of this count=count+'@';
				//both are same denotion
				break;
			case 'a'| 'A':
				count = count + "@";
				break;
			case 'O' | 'o':
				count = count + "@";
				break;
			case 'I' | 'i':
				count = count + "@";
				break;
			case 'u' | 'U':
				count = count + "@";
				break;

			default:
				count = count+s.charAt(i);
				break;
			}
			
			//System.out.print(count);  //2nd method
			
		}System.out.print(count);
		
	}
}
// 1st method- 
//String count is given outside the loop
//so system.out is also given outside the loop

//2nd method
//String count is given inside the loop
//so system.out is also given inside the loop
