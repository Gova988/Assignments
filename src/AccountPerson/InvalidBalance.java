package AccountPerson;

public class InvalidBalance extends  RuntimeException {

	public InvalidBalance() {
		super();
		
	}

	public InvalidBalance(String message) {
		super(message);
		System.out.println("you minimum balance is below 500 ");
		
	}

} 
	


