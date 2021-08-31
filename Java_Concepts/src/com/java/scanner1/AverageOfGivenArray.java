package com.java.scanner1;

public class AverageOfGivenArray {
	public static void arrayyy() {
		int[]a= {1,2,3,4,5,6,7,8,9,10};
		float count=0;
		
		for (int i = 0; i < a.length; i++) {
			count = count+a[i];
		}
		System.out.println("Output:"+Math.ceil(count/(a.length-1)));
		
		}
		public static void main(String[] args) {
			arrayyy();
	}

}
