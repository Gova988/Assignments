package test;

public class Test {
	

		public static void main(String[] args) {
			Student std1 = new Student();
			Student std2 = new Student();
			System.out.println(std1.getStdId());
			System.out.println(std1.getName());
			System.out.println(std1.getAge());
			
			
			std1.setStdId(10001);
			std1.setName("gova");
			std1.setAge(21);
			
			
			
			System.out.println(std1.getStdId());
			System.out.println(std1.getName());
			System.out.println(std1.getAge());
		
			
			
			std2.setStdId(100);
			std2.setName("gangi");
			std2.setAge(21);
			
			System.out.println();
			System.out.println(std2.getStdId());
			System.out.println(std2.getName());
			System.out.println(std2.getAge());
			
			Student std3 = new Student(1003, "nara", 21);
			
			System.out.println();
			System.out.println(std3.getStdId());
			System.out.println(std3.getName());
			System.out.println(std3.getAge());
			
			std3.setContactNo("9908793183");
			System.out.println(std3.getContactNo());
			
				

		}

	}


