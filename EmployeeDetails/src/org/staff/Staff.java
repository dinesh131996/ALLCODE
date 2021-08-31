package org.staff;

public class Staff {
	public void stfName(String a) {
		System.out.println("staff name is:" +a);
	}
	public void stfId(int a) {
		System.out.println("Staff ID is: "+a);	
		}
	public void staffDept(String a) {
		System.out.println("Staff dept is: "+a);
		}
	public static void main(String[] args) {
		Staff ll = new Staff();
		ll.staffDept("ll");
		ll.stfName("llll");
		ll.stfId(52);
	}
}
