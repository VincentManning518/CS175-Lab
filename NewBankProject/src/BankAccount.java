/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals
 */
public class BankAccount 
{
	private String name;
	private double balance;
	private int acct;
	private static int accountNumber = 0;

	/**
	 * Constructs a bank account with a zero balance
	 */
	public BankAccount()
	{
		balance = 0;
	}
	/**
	 * Constructs a bank account with a given balance
	 * @param initialBalance the initial balance
	 */
	public BankAccount(String name,double initialBalance)
	{
		this.balance = initialBalance;
		this.name = name;
		accountNumber++;
		this.acct = accountNumber;
		
	}
	/**
	 * Deposits money into the bank account
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	/**
	 * Withdraws money from the bank account
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		if (amount>balance) 
		{
			throw new IllegalArgumentException("WD amount "+amount+" exceeds balance of "+balance);
		}
		balance = balance - amount;
	}
	/**
	 * Gets the current balance of the bank account
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}
	public String getAccount()
	{
		return this.name+" " + this.acct+" " + this.balance;
	}
	public double anyAccount(BankAccount otherAccount) 
	{
		return otherAccount.getBalance();
	}
	public void transfer(double amount,BankAccount otherAccount) 
	{
		balance = balance - amount;
		otherAccount.deposit(amount);
		
	}
}

