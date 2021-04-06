package bankProject;
import java.util.Scanner;
public class BankThreshold {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		
		// Opens Bank account with initial balance and interest rate:
		
		BankAccount Acct = new BankAccount();
		System.out.println(" ");
		double balance = Acct.getBalance();
		
		// Determines if user wants to find out how many months until a certain amount in their account is reached
		System.out.print("Would you like to calculate interest until a certain threshold? Y/N: ");
		String input = in.next();
		boolean determinant;
		
		if (input.contains("Y"))
		{
			determinant = true;
		}
		
		else if (input.contains("N"))
		{
			determinant = false;
			System.out.println("Inlavild response. Goodbye!");
		}
		
		else 
		{
			determinant = false;
			System.out.println("Inlavild response. Goodbye!");
		}
		
		System.out.print("Please enter a threshold, press q to stop: ");
		double totInt = 0;
		double rate = Acct.getInterest();
		
		if (determinant == true)
		{
			while (in.hasNextDouble())
			{
				int months = 0;
				double thresh = in.nextDouble();
		
				while (balance < thresh)
				{
					double interest = balance * rate;
					balance = balance + interest; 
					months++;
				}
				balance = Acct.getBalance();
				System.out.println("Months: " + months);
		}
		
		}

	}
}