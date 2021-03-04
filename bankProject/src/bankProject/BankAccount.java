package bankProject;

public class BankAccount {
	  
		// TODO Auto-generated method stub
		/**
		   A bank account has a balance and a mechanism for
		   applying interest or fees at the end of the month.
		*/
		
		
		   private double balance, rate, interest;

		   /**
		      Constructs a bank account with balance of "initialBal".
		 * @return 
		   */
		   public BankAccount(double initialBal, double interestPct )
		   {
		      balance = initialBal;
		      rate = interestPct;
		      System.out.println("Created new account with $1000.00 balance and interest rate of 0.05");
		   }

		   /**
		      Makes a deposit into this account.
		      @param amount the amount of the deposit
		   */
		   public void deposit(double amount)
		   {
		      balance = balance + amount;
		      System.out.println("Deposited: " + amount);
		   }

		   /**
		      Makes a withdrawal from this account, 
		      @param amount the amount of the withdrawal
		   */
		   public void withdraw(double amount)
		   {
			   if(amount < balance)
			   {
				   balance = balance - amount;
				   System.out.println("Withdrew: " + amount);
			   }
			   else
			   {
				   System.out.println("Insufficient funds to support withdrawal");
			   }
		   }
		
		   public void calcInterest(String decision)
		   {
			   if (decision.contains("Y"))
			   {
			   interest = balance * rate;
			   System.out.println("Interest: " + interest);
			   }
			   else
			   {
				   
			   }
		   }
		   
		   
		   public double getBalance()
		   {
		      return balance + interest;
		   }
		      
}

