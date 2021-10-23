package AccountPerson;

public class CurrentAccount extends Account{
	double overdraftLimit;
	
	public boolean withdraw()
	{
		if(overdraftLimit>50000)
		{
			throw new InvalidBalance(" you exceeded the limit");
		}
		else System.out.println("you can withdraw");
		
		return true;
		
	}
} 


