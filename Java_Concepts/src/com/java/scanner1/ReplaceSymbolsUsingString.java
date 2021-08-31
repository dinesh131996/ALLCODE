package com.java.scanner1;

public class ReplaceSymbolsUsingString {
	public static void main(String[] args) {
		
	
 String count="";
 String s= "Welcome";
 count= count+s.substring(0, 1)+s.substring(1, 2).replace('e', '@')+s.substring(2, 4)+
		 s.substring(4, 5).replace('o', '@')+s.substring(5, 6)+s.substring(6).replace('e', '@');
 System.out.println(count);

}
};