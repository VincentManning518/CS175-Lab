package CreditCardNumber;
import java.util.Scanner;
public class CreditCardProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int i = 1;
		char a;
		String cardNum = "";
		double parsed=1;
		 
		while (parsed > 0)
		{
			System.out.println("Please input a card number with dashes and/or spaces. Enter -1 to end: ");
			cardNum = in.nextLine();
			
			while (i < cardNum.length()) 
			{
				a = cardNum.charAt(i);
			
				if (a == '-' || a == ' ')
				{
					String before = cardNum.substring(0, i);
					String after = cardNum.substring(i+1);
					cardNum = before + after;
				}
			
				else
				{
					i++;
				}
				
			}
			System.out.println(cardNum);
			parsed = Double.parseDouble(cardNum);
			
			i = 1;
		}
		
		System.out.println("Goodbye!");
	}
}
