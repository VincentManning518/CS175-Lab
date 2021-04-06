package bankProject;
import java.util.Scanner;
public class BankAccount {
	  
	
		   private double balance, rate, interest;

			Scanner in = new Scanner(System.in);

		   public BankAccount()
		   {
			   System.out.print("Enter amount to start the account: ");
				double initialBal = in.nextDouble();
				System.out.println(" ");
				
				System.out.print("Enter the interest rate for this account: ");
				double interestPct = in.nextDouble();
				System.out.println(" ");
				
		      balance = initialBal;
		      rate = interestPct;
		      System.out.println("Created new account with $" + initialBal + " balance and interest rate of " + interestPct);
		   }
		   
		   public double getInterest()
		   {
			   return rate;
		   }

		
		   public void deposit(double amount)
		   {
		      balance = balance + amount;
		      System.out.println("Deposited: " + amount);
		   }

	
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
		
		   public double calcInterest(String decision)
		   {
			   if (decision.contains("Y"))
			   {
			   interest = balance * rate;
			   }
			   else
			   {
				   
			   }
			return interest;
			
		
		   }
		   
		   
		   public double getBalance()
		   {
		      return balance + interest;
		   }
		      
}

