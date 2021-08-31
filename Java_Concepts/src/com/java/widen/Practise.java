package com.java.widen;

import java.util.Scanner;

public class Practise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kk = sc.nextInt();
			
	if (kk>=1 && kk<=100 &&kk%2==0) {
	if (kk>=6 && kk<=20) {
			System.out.println("wired");
		}
		else {
			System.out.println("not wired");
		}
	}
	else {
	if (kk>=1 && kk<=100 &&kk%2==1) {
		System.out.println("wired");
	}
	}
	}}