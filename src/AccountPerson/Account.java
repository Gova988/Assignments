package AccountPerson;

public class Account extends InvalidBalance{
	private long accNum;
	private double balance;
	
	private Person accHolder;
	
	public long getAccNum() {
		return accNum;
		
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public double setBalance(double balance) {
		return this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
}


