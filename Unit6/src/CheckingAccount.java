public class CheckingAccount extends BankAccount
{
	private int transactionCount;
	private static final int FREE_TRANSACTIONS = 3;
	private static final double TRANSACTION_FEE = 2.0;
	
	//call super constructor
	//then set transactionCount to zero
	public CheckingAccount()
	{
		super();
		transactionCount=0;
	}
	
	//call secondary super constructor
	//then set transaction count to zero
	public CheckingAccount(int initialBalance)
	{
		super(initialBalance);
		transactionCount=0;
	}
	
	//override deposit method
	//deposit money and increment transactionCount
	public void deposit(double amount) 
	{  
		super.deposit(amount);
		transactionCount++;
	}
	
	//override withdraw method
	//withdraw money and increment transactionCount
	public void withdraw(double amount)
	{
		super.withdraw(amount);
		transactionCount++;
	}
	
	//adding functionality
	public void deductFees()
	{
		if (transactionCount > FREE_TRANSACTIONS){
			double fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
			super.withdraw(fees);
		}
	transactionCount = 0;
	}

}



