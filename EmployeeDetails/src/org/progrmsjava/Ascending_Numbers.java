package org.progrmsjava;

public class Ascending_Numbers {
public static void main(String[] args) {
	int [] a= {10,20,8,2,55};
	int temp;
	for (int j = 0; j < a.length; j++) {
	for (int i = j+1; i < a.length; i++) {
		if (a[j]>a[i]) {
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			
		}
	}
		
		
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
class Diamond{
public static void main (String[]args){
int [] a = {10,20,30,40,50};
for(int i=0; i<a.length; i++ ){
System.out.println(a[i]);
}
}
}