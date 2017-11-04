public class BankAccount
{ 
	private double balance;
	
	//constructor
	public BankAccount()
	{
		balance = 0;
	}
	
	//secondary constructor
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	//add money to balance
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	//subtract money from balance
	public void withdraw(double amount)
	{  
		balance = balance - amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	//take money from this account
	//deposit the money into other bank account
	public void transfer(BankAccount other, double amount)
	{
		withdraw(amount);
		other.deposit(amount);
	}
	
	public String toString(){
		String str = "";
		str += "The balance of this bank account is " + balance;
		return str;
	}
}


