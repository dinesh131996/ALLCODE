package org.emp;

public class Armstrong {
public static void main(String[] args) {
	 
	
	for (int n = 0; n <500000; n++) {
		int i=0; int j=0;
		int a=n;
	while (a>0) {
		i=a%10;
		j=j+(i*i*i);
		a=a/10;
	}
	if (n==j) {
		System.out.println("arms"+n);
	}
	}
}
}
