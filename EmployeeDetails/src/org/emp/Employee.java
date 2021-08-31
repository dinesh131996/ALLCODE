package org.emp;

public class Employee {
	public void empId() {
System.out.println("123");
	}
	public void empName() {
		System.out.println("Dinesh");
	}
	public void empDob() {
		System.out.println("01/03/1996");
	}
	public void empPhone() {
		System.out.println("8344787974");
	}
	public void empEmail() {
		System.out.println("dinesh.131996.ds@gmail.com");
	}
	public void empAddress() {
		System.out.println("Namakkal");
	}
public static void main(String[] args) {
	Employee output = new Employee();
	output.empId();
	output.empName();
	output.empDob();
	output.empPhone();
	output.empEmail();
	output.empAddress();
}
}
