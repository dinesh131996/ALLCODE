package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void empName() {
		System.out.println("Dinesh");
	}

	public static void main(String[] args) {
		Employee output = new Employee();
		Project o1 = new Project();
		Company o2 = new Company();
		Client o3 = new Client();
		output.empName();
		o1.projectName();
		o2.companyName();
		o3.clientName();
	}
}
