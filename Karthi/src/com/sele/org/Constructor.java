package com.sele.org;

public class Constructor {
	 int a;
	 int b;
	  String c;


	 
	
	 Constructor(int x, int y, String z) {
		a=x;
		b=y;
		c=z;
		System.out.println(a);
				
	}
	
	 public static void main(String[] args) {
		Constructor r=new Constructor(5, 6, "xyz");
		
	     String m = r.c;
	      int q = r.a;
		System.out.println(q);
		System.out.println(m);
		System.out.println(r.c);
		
	}

}
