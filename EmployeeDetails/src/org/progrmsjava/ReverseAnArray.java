package org.progrmsjava;

public class ReverseAnArray {
public static void main(String[] args) {
	int[] a= {10,10,5,258,225,45};
	int temp=0;
	for (int i = 0; i < a.length; i++) {
		
		for (int j = i+1; j < a.length; j++) {
			if (a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}for (int s = 0; s < a.length; s++) {
		
		System.out.println(a[s]);
	}
	
	
}
}
