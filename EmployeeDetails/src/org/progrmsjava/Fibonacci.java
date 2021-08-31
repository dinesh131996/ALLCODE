package org.progrmsjava;

public class Fibonacci {
	public static void main(String[] args) {
		
		int a=0,b=1,c=a+b;
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		for (int fo = 1; fo <15; fo++) {
			a=b;
			b=c;
		 c=a+b;
			System.out.println(c);
		}
		
		
	}

}
class factorila{
	public static void main(String[] args) {
		
		int c =1;
		for (int i = 1; i < 7; i++) {
			
			c=c*i;
			System.out.println(c);
		}
	}
}