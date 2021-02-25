package bankProject;
import java.util.Scanner;
public class BankAccountTester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		// Takes initial balance input and deposits it into a bank account of 0 balance
		
		double StartBal, DepAmt, WithAmt;
		
		System.out.print("Please input your initial balance: ");
		StartBal = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount();
		System.out.println(" ");
		myBankAccount.deposit(StartBal);
		
		// Withdraws an amount input by the user
		
		System.out.print("Please input your withdrawal amount: ");
		WithAmt = in.nextDouble();
		
		myBankAccount.withdraw(WithAmt);
		System.out.println(" ");
		
		// Deposits an amount input by the user
		
		System.out.print("Please input your deposit amount: ");
		DepAmt = in.nextDouble();
			
		myBankAccount.deposit(DepAmt);
		System.out.println(" ");
		
		// Returns the current balance of the bank account
		
		 System.out.print("Current Balance: ");
		 System.out.println(myBankAccount.getBalance());
		
		
	}

}
