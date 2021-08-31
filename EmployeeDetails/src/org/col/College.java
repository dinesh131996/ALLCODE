package org.col;

import org.progrmsjava.Students;
import org.staff.Staff;


public class College {
	public void collegeName(String b) {
		System.out.println("College name is: " + b);
	}
	public static void main(String[] args) {
		College o1 = new College();
		Students o0 = new Students();
       
         o1.collegeName("Vivekanandha");
         o0.stuId(245);
         o0.stuName("Dinesh");
         o0.stuDept("Physics");
         Staff o2 = new Staff();
         o2.staffDept("dinesh");
         o2.stfName("HIper");
        o2.stfId(2); 
	}
}
class height{
	public static void main(String[] args) {
	String s="dinesh";
	String[] split = s.split("");
	for (int i = 0; i <=2; i++) {
		System.out.print(split[i]);
		
	}
}
}
class Goa{
public static void main(String[] args) {
	String s = "phyush";
	String[] split = s.split("");
	for (int i = 5; i>=0; i--) {
	System.out.print(split[i]);
		
	}
}	
}