package com.java.armstrong;

import java.util.Scanner;

public class Armstrong {
	
	
	public static void main(String[] args) {
		
		String b ="153";
		Scanner sc = new Scanner(b);
		int sc1 = sc.nextInt();
//for (int n = 1; n <=400; n++) {
	int num1=100;
	int num2=200;
	int a=sc1;
	int i=0,j=0;

while(a>0) {
	i=a%10;
	j=j+(i*i*i);
	a=a/10;
	
}

num1=num1>num2 ? num1-num2 : num1+num2;


  if (sc1==j) { System.out.println("armstrong number"); } else {
  System.out.println("not amstrong number"); }
 


}//}
}