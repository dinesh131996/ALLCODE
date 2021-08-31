import java.util.Scanner;

public class Scannerrr {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int size=sc.nextInt();
	int m1 = sc.nextInt();
	int m2 = sc.nextInt();
	int m3 = sc.nextInt();
	int m4 = sc.nextInt();
	int m5 = sc.nextInt();
	int a=m1+m2+m3+m4+m5;
	System.out.println("The sum og total values="+a);
	int b=a/5;
	
	System.out.println("Average of the numbers="+b);
}
}
