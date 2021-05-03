import java.util.ArrayList;
public class BankAccountTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount gil = new BankAccount("Gil",500);
		BankAccount joe = new BankAccount("Joe",1000);
		BankAccount fred = new BankAccount("Fred",2000);
		BankAccount sally = new BankAccount("Sally",2500);

		ArrayList<BankAccount> accountList = new ArrayList<>();
		
		accountList.add(gil);
		accountList.add(joe);
		accountList.add(fred);
		
		for (int i = 0; i < accountList.size(); i++)
		{
			BankAccount info = accountList.get(i);
			System.out.println(info.getAccount());
		}
		
		accountList.add(sally);
		
		double highestBal = 0;
		for (int i = 0; i < accountList.size(); i++)
		{
			BankAccount info = accountList.get(i);
			double balance = info.getBalance();
			
			if(balance >= highestBal)
			{
				highestBal = balance;
			}
			
			else 
			{
				highestBal = highestBal;
			}
		}
		System.out.println("The highest balance is: " + highestBal);
		
		accountList.remove(3);
		
		highestBal = 0;
		for (int i = 0; i < accountList.size(); i++)
		{
			BankAccount info = accountList.get(i);
			double balance = info.getBalance();
			
			if(balance >= highestBal)
			{
				highestBal = balance;
			}
			
			else 
			{
				highestBal = highestBal;
			}
		}
		System.out.println("The updated highest balance is: " + highestBal);
		
	}

}
