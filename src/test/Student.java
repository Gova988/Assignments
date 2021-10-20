package test;

public class Student {
		
		private int stdId; 
	    private String name;
		private int age;
		private String contactNo;
		private char salary;
		
		
		// Constructor
		public Student() {}
		
		public Student(int stdId, String name, int age) {
			super();
			this.stdId = stdId;
			this.name = name;
			this.age = age;
			this.salary=salary;
		}
		
		// Getters & Setters
		
		public int getStdId() {
			return stdId;
		}
		
		public void setStdId(int stdId) {
			this.stdId = stdId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		public String getContactNo() {
			return contactNo;
		}

		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}


		@Override
		public String toString() {
			return "Student [stdId=" + stdId + ", name=" + name + ", age=" + age + ", contactNo=" + contactNo + ",salary="+salary+"]";
		}

		public char getSalary() {
			
			return salary;
			
		}
		public void setSalary(char salry) {
			this.salary = salary;
		
		}
}

	

		


