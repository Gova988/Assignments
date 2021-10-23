package inheritance;

public class Employee  extends Person {
	
		int Empno;
		String EmpName;
		int Empphone;
		
		void work() {
			System.out.println("work");
		}
		
		void write() {
			System.out.println("write");
		}
		
		void run() {
			System.out.println("Child class Run method");
		}
		
		void speak() {
			System.out.println("Child class Speak method");
		}

		

}
