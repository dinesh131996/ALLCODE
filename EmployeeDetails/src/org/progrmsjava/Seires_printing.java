package org.progrmsjava;

public class Seires_printing {
public static void main(String[] args) {
	
	
	for (int i = 5; i >0; i--) {
		for (int j = 5; j >0; j--) {
			if (i==5) {
				System.out.print(i);
			}else if (i==4) {
				if (j==5) {
					System.out.print(j);
				}else {
					System.out.print(i);
				}
			}else if (i==3) {
				if (j>=4) {
					System.out.print(j);
				}else {
					System.out.print(i);
				}
			}else if (i==2) {
				if (j>=3) {
					System.out.print(j);
				}else {
					System.out.print(i);
				}
			}else if (i==1) {
				if (j>=2) {
					System.out.print(j);
				} else {
System.out.println(i);
				}
			}
		}System.out.println();
		
	}
	
}
}
