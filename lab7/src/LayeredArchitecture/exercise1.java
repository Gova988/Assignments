package LayeredArchitecture;

import java.util.Scanner;

public class exercise1 {
	public int id;
	public String name;
	public double salary;
	public String designation;
	public String insuranceScheme;
	
	// Creating method to check eligibility
	public String getInsuranceScheme() {
		insuranceScheme="No Scheme";
		if((salary>5000 && salary<20000) && designation.equalsIgnoreCase("System Associate")) {
			insuranceScheme="Scheme C";
		}
		
		else if ((salary>=20000 && salary<40000) && designation.equalsIgnoreCase("Programmer")) 
		{
			insuranceScheme= "Scheme B";
		}
		
		else if (salary>=40000 && designation.equalsIgnoreCase("Manager")) {
			insuranceScheme= "Scheme A";
		}
		
		else if (salary<5000 && designation.equalsIgnoreCase("Clerk")) {
			insuranceScheme= "No Scheme";
		}
		
		return insuranceScheme;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		

	}

}
