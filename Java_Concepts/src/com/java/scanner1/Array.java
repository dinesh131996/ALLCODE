package com.java.scanner1;

import com.java.constructor.A;

public class Array {
	public static void Are() {
		int [] a= {10,10,20,3,025,2253};
		
		/*a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;*/
		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
	Array nn = new Array();	
		Are();
	}

}
class King{
	public static void main(String[] args) {
		Object []a= {"java",123,1223.5,2222222222L,"ll",245.3};
		/*a[0]="java";
		a[1]=123;
		a[2]=1223.5;
		a[3]=2222222222222222222L;*/
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			
		
	System.out.println(a[i]);	
		}
		Array.Are();
	}
}
