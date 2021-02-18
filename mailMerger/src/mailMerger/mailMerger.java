package mailMerger;
import java.util.Scanner;
public class mailMerger {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String firstName, lastName, street, yORn, houseNumber;
		
		
		//
		
		String promptText1 = "Please enter your first name: ";
		System.out.print(promptText1);
		firstName = in.nextLine();
		
		String promptText2 = "Please enter your last name: ";
		System.out.print(promptText2);
		lastName = in.nextLine();

		String promptText3 = "Please enter your house number: ";
		System.out.print(promptText3);
		houseNumber = in.nextLine();

		String promptText4 = "Please enter your street: ";
		System.out.print(promptText4);
		street = in.nextLine();
		
		String promptText5 = "Is this address correct: ";
		System.out.print(promptText5);
		yORn = in.nextLine();
		
		//
		
		String replaceText1 = "Dear <firstName> <lastName>,";
		String replaceText2 = "Please confirm that your address is <houseNumber> <street>.";
		String replaceText3 = "Your answer is: <yORn> Goodbye!";
		
		replaceText1 = replaceText1.replace("<firstName>", firstName);
		replaceText1 = replaceText1.replace("<lastName>", lastName);
		replaceText2 = replaceText2.replace("<houseNumber>", houseNumber);
		replaceText2 = replaceText2.replace("<street>", street);
		replaceText3 = replaceText3.replace("<yORn>", yORn);
		
		System.out.println(replaceText1);
		System.out.println(replaceText2);
		System.out.println(replaceText3);
	
		
		
		
	}

}
