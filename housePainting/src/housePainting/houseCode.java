package housePainting;
import java.util.Scanner;
public class houseCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double costSqFt, length, width, height, NumDoors, DoorLength, DoorWidth, NumWindows, WindowLength, WindowWidth;
		
		System.out.print("Please enter the cost per SqFt:");
		costSqFt = in.nextInt();
		System.out.println("");
		
		System.out.print("Please enter the length of house:");
		length = in.nextInt();
		System.out.println("");
		
		System.out.print("Please enter the width of house:");
		width = in.nextInt();
		System.out.println("");
		
		System.out.print("Please enter the height of house:");
		height = in.nextInt();
		System.out.println("");
		
		System.out.print("Please enter the the number of doors:");
		NumDoors = in.nextInt();
		System.out.println("");
		
		System.out.print("Please enter the the length of the doors:");
		DoorLength = in.nextInt();
		System.out.println("");
		
		System.out.print("Please enter the the width of the doors:");
		DoorWidth = in.nextInt();
		System.out.println("");
		
		System.out.print("Please enter the the number of windows:");
		NumWindows = in.nextInt();
		System.out.println("");
		
		System.out.print("Please enter the the length of the windows:");
		WindowLength = in.nextInt();
		System.out.println("");
		
		System.out.print("Please enter the the width of the windows:");
		WindowWidth = in.nextInt();
		System.out.println("");
		

		double NormalArea = width * length;
		double PeakHeight = height - width;
		double PeakArea = PeakHeight * length / 2;
		double PeakSideArea = PeakArea + NormalArea;
		double TotalSideArea = PeakSideArea * 2 + NormalArea * 2;
		
		double TotalDoorArea = (DoorLength * DoorWidth) * NumDoors;

		double TotalWindowArea = (WindowLength * WindowWidth) * NumWindows; 
		
		double FinalSqFt = TotalSideArea - (TotalDoorArea + TotalWindowArea);
		
		System.out.print("Your total paintable surface area is:");
		System.out.print(FinalSqFt);
		System.out.print(" square feet");
		System.out.println("");
		
		double FinalCost = FinalSqFt * costSqFt;
		
		System.out.print("Your estimate is:");
		System.out.print(FinalCost);
		System.out.print(" dollars.");
		
		
		










	}

}
