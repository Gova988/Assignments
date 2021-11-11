package LayeredArchitecture;

import java.util.Scanner;

public class EmployeeServiceDemo extends exercise1 implements EmployeeService{
	
	exercise1 emp= new exercise1();

	@Override
	public void getEmpDetails() {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Emp ID: ");
		emp.id=scn.nextInt();
		System.out.println("Enter Emp Name: ");
		emp.name=scn.next();
		System.out.println("Enter Salary: ");
		emp.salary=scn.nextDouble();
		System.out.println("Enter Your Designation: ");
		emp.designation= scn. next();
		
		scn.close();
		
	}

	@Override
	public void displayEmpDetails() {
		
		emp.insuranceScheme="No Scheme";
		if((emp.salary>5000 && emp.salary<20000) && emp.designation.equalsIgnoreCase("System Associate")) {
			emp.insuranceScheme="Scheme C";
		}
		
		else if ((emp.salary>=20000 && emp.salary<40000) && emp.designation.equalsIgnoreCase("Programmer")) {
			emp.insuranceScheme= "Scheme B";
		}
		
		else if (emp.salary>=40000 && emp.designation.equalsIgnoreCase("Manager")) {
			emp.insuranceScheme= "Scheme A";
		}
		
		else if (emp.salary<5000 && emp.designation.equalsIgnoreCase("Clerk")) {
			emp.insuranceScheme= "No Scheme";
		}
		
		System.out.println("ID\tName\tSalary\tDesignation\tInsurance Scheme");
		System.out.println();
		System.out.println(emp.id+"\t"+emp.name+"\t"+emp.salary+"\t"+emp.designation+"\t"+emp.insuranceScheme);
	} 

}
