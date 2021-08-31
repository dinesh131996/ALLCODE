package com.java.constructor;

import java.util.Scanner;

class Scanner1 {
	public void boy() {
		Scanner sc = new Scanner(System.in);
String ss = sc.nextLine();
System.out.println("employe name is"+ss);

Scanner sc1 = new Scanner(System.in);
int hh = sc1.nextInt();
System.out.println("employee id "+hh);

Scanner sc2 = new Scanner(System.in); 
int nextInt2 = sc2.nextInt();
int ff = sc2.nextInt();
int hi = sc2.nextInt();
int nll = sc2.nextInt();
int ij = sc2.nextInt();
System.out.println(nextInt2);
System.out.println(ff);
System.out.println(hi);
System.out.println(nll);
System.out.println(ij);
int a=(nextInt2+ff+hi+nll+ij);
int b= ((nextInt2+ff+hi+nll+ij)/5);

System.out.println("sum of "+a);
System.out.println("average of" +b);

sc.close();
sc1.close();
sc2.close();
	}
	 public static void main(String[] args) {
		 Scanner1 ll = new Scanner1();
		 ll.boy();
		 
	}
	
	

}
