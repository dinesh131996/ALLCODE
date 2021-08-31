package com.java.scanner1;

public class AddingNumbersInArray {
public static void arrayy() {
int[]a= {1,2,3,4,5,6,7,8,9,10};
int count=0;
for (int i = 0; i < a.length; i++) {
	count = count+a[i];
}
System.out.println("Output:"+count);
}
public static void main(String[] args) {
	arrayy();
}
}
