package bankProject;
import java.util.Scanner;
public class BankAccountTester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		double DepAmt, WithAmt, startBal, intRate;
		
		// Creates a bank account with a balance of 1000 and interestPct of 0.05
		
		System.out.print("Enter amount to start the account: ");
		startBal = in.nextDouble();
		System.out.println(" ");
		
		System.out.print("Enter the interest rate for this account: ");
		intRate = in.nextDouble();
		System.out.println(" ");
		
		BankAccount myBankAccount = new BankAccount(startBal, intRate);
		System.out.println(" ");
		
		// Deposits an amount input by the user
		
		System.out.print("Please input your deposit amount: ");
		DepAmt = in.nextDouble();
		
		myBankAccount.deposit(DepAmt);
		
		// Withdraws an amount input by the user
		
		System.out.print("Please input your withdrawal amount: ");
		WithAmt = in.nextDouble();
		
		myBankAccount.withdraw(WithAmt);
		System.out.println(" ");
		
		// Calculates the interest, if the user decides so, and prints it
		
		String decision; 
		System.out.print("Would you like to calculate your interest? Y/N: ");
		decision = in.next();
		
		myBankAccount.calcInterest(decision);

		
		// Returns the current balance of the bank account
		
		System.out.print("Current Balance: ");
		System.out.println(myBankAccount.getBalance());
		
		
	}

}
