package test;

public class HelloWorld {
	
		
	
		private int stdId; 
		public String name; 
		static int age; 

		
		HelloWorld() {}
		
		
		HelloWorld(int stdId) {
			this.stdId = stdId;
		}
		HelloWorld(String name) {
			this.name = name;
		}
		HelloWorld(int stdId, String name) {
			this.stdId = stdId;
			this.name = name;
		}
		
		
		static {
			
		}
		
		{
		
		}
		
	
		public static void main(String[] args) {
			int y = 200; // 
			HelloWorld hello = new HelloWorld(1000, "gova");
			System.out.println(hello.stdId);
			System.out.print(hello.name);
			System.out.println(hello.getStdId());
			System.out.println(age);
			System.out.println(y);

		}
		
	
		private int getStdId() {
			return stdId;
		}
		
		void setName(String n) {
			this.name = n;
		}
		
		void setAge(int age) {
			this.age = age;
		}
		
		void setStdId(int id) {
			this.stdId = id;
		}
		

	}




