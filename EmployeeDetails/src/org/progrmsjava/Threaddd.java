package org.progrmsjava;

class a extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class b extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Threaddd {
	public static void main(String[] args) throws InterruptedException {
		a aa = new a();
		b bb = new b();
		/*
		 * Thread t1=new Thread(); t1.start(); Thread t2=new Thread(); t2.start();
		 */

		aa.start();
		Thread.sleep(1000);
		bb.start();

	}
}
