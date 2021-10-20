package test2;
import test.Student;

public class gova{

	public static void main(String[] args) {
		Student std1 = new Student();
		System.out.println(std1.getStdId());
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		
		
		std1.setStdId(2001);
		
		std1.setName("suman");
		std1.setAge(25);
		std1.setContactNo("9885352542");
		
		System.out.println(std1.getStdId());
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		System.out.println(std1.getContactNo());
		
		
		System.out.println(std1);
	}
}


