package org.progrmsjava;

public class Palindrome {
public static void main(String[] args) {
	int a[] = new int [6];
	for (int i = 0; i < a.length; i++) {
		a[i]=i;
	}
	
	int b=0;int k=0; int j=0;
	for (int i = a.length-1; i >0; i--) {
		b=a[i];
		while (b>0) {
			k=b%10;
			j=j+(k*k*k);
			b=b/10;	
		}
		if(b==a[i]) {
			
		}
	}
	
}
}
