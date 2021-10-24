package Exceptionhandling;

import java.util.Scanner;


class ValidateNameException extends Exception{
	
}

public class EmployeeDetails {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name:  ");
		String fname=sc.nextLine();
		System.out.println("Enter the last name:  ");
		String lastname=sc.nextLine();
		try {
			if(fname.isEmpty() || lastname.isEmpty()) {
				throw new Exception();
				
			}
		}catch(ValidateNameException v) {
			System.out.println("Firstname and lastName cannot be blank");
		}finally {
			System.out.println("your name is : "+ fname +" "+ lastname);
			
		}

	}

}
