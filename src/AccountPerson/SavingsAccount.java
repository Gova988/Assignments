package AccountPerson;

public class SavingsAccount extends Account {
	final double minBalance = 500.0;
	
	public void withdraw()
	{
		
		if(minBalance<500.00)
		{
			System.out.println("minimum balance");
			throw new InvalidBalance("you can't withdraw");
			
		}
		else
		{
			System.out.println("you can withdraw your money");
		}
	}
	
}


