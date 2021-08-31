package org.progrmsjava;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate_Array {
	
public static void main(String[] args) {
	int a[]= {10,20,20,21,30,3,10};
	
	for (int i = 0; i < a.length; i++) {
		
		int b[]= new int[a.length];
		System.out.println(a[i]);
		b[i]=a[i];
		System.out.println(b[i]);
	}
	
	Set<Integer> set = new LinkedHashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		set.add(a[i]);
	}
	System.out.println(set);
}
}
class square{
	static int c=1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
	
		System.out.println(c);
		System.out.println(Math.sqrt(16));
	}
}
class sqrt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sqr = sc.nextInt();
	for (int i = 1; i < sqr; i++) {
		int rem=sqr%i;
		if (rem==0 && (sqr/i)==i) {
			System.out.println(i);
		}
	}
	}
}
