package org.progrmsjava;

import java.util.Iterator;
import java.util.Scanner;

public class Scanner_array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String size = sc.next();
	int size1 = Integer.parseInt(size);
	String a[]= new String[size1];
	for (int i = 0; i < size1; i++) {
		a[i]=sc.next();
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
class order {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		
		int a[]= new int[size];
		for (int i = 0; i < size; i++) {
			a[i]=sc.nextInt();
		}
		int temp;
		for (int i = 0; i < a.length; i++) {

for (int j = i+1; j < a.length; j++) {
	if (a[i]>a[j]) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
		}System.out.println("mini numbers="+a[0]);
System.out.println("max numbers="+a[a.length-1]);
	}	
		
	}
