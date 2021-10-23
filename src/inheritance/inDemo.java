package inheritance;

public class inDemo {
	public class InheritanceDemo {
		
		public static void main(String[] args) {
			Person p = new Person();
			p.run();
			p.speak();
			System.out.println(p.name);
			System.out.println(p.age);
			System.out.println(p.DOB);
		
			
			System.out.println();
	
			
			Employee e = new Employee();
		
			e.run();
			e.speak();
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.DOB);
			e.work();
			e.write();
			System.out.println(e.Empno);
			System.out.println(e.EmpName);
			System.out.println(e.Empphone);
			
			
			System.out.println();
			Person p1 = new Employee();
			System.out.println(p1.age);
			System.out.println(p1.name);
			System.out.println(p1.DOB);
			p1.speak();
			p1.run();
		
			
		}
	}

}
