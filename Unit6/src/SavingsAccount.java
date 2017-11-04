public class SavingsAccount extends BankAccount
{
	private double interestRate;
	
	//constructor
	//takes value for interest rate as parameter
	//call super constructor first!
	public SavingsAccount(double rate)
	{
		interestRate=rate;
	}
	
	//secondary constructor
	//send initialBal to super constructor
	//then store value for interest rate
	public SavingsAccount(double rate, double initialBal)
	{
		super(initialBal);
		interestRate=rate;
	}
	
	//this method adds functionality to SavingsAccount
	//compute the money earned by interest (current balance * percent interest)
	//then deposit the generated interest into the balance of the account
	public void addInterest()
	{
		double amount=0;
		amount=super.getBalance()*interestRate;
		super.deposit(amount);
	}
}