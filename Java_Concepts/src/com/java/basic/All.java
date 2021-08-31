package com.java.basic;

public class All  {
	 int b=10000*20000;
	public void serialNo() {
		System.out.println(1);
	}

	public void name(String l) {
		System.out.println("my name is: " + l);
	}

	public void empId(int k) {
		System.out.println("my id is:" + k);
	}

	public void bloodGroup(String j) {
		System.out.println("my blood group is: " + j);
	}

	private void clothes(int h, int g) {
		System.out.println("my old dresses are: " + h);
		System.out.println("my new dresses are: " + g);
	}

	public static void main(String[] args) {
		All outpu = new All();
		System.out.println("the value of b is "+outpu.b );
		System.out.println(Details.a);  ;
		outpu.bloodGroup("A1 positive");
		outpu.empId(234);
		outpu.name("dinesh");
		outpu.serialNo();
		Dinu.empID(123);
		Dinu.mom("lll");
		Dinu.bloodGroup('m');
		Dinu.dresses(12, 58);
		outpu.clothes(123, 558);

	}
}
