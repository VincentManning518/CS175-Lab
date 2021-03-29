import java.util.Scanner;
public class romanNumerals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please input a positive integer between 1 and 3,999: ");
		int input = in.nextInt();
		String inputStr = String.valueOf(input);
		String n = "";
		
		// Determines if the value can be described as a Roman Numeral
		if (input < 1 || input > 3999)
		{
			System.out.print("Invalid input");
		}
		
		// Path is input is >=1000
		if (inputStr.length() == 4)
		{
			String first = inputStr.substring(0,1);
			String second = inputStr.substring(1,2);
			String third = inputStr.substring(2,3);
			String fourth = inputStr.substring(3,4);
			
			int int1 = Integer.parseInt(first);
			int int2 = Integer.parseInt(second);
			int int3 = Integer.parseInt(third);
			int int4 = Integer.parseInt(fourth);

				//Int1 Path
				while (int1 > 0)
				{
					n += "M";
					int1--;
				}
				
				
				// Int 2 Path
				if (int2 == 9)
				{
					n += "CM";
					int2 = int2 - 9;
				}
				if (int2 == 4)
				{
					n += "CD";
					int2 = int2 - 4;
				}
					if (int2 >= 5 && int2 <= 8)
					{
						n += "D";
						int2 = int2 - 5;
					}
					while (int2 > 0 && int2 <5)
					{
						n += "C";
						int2--;
					}
					
				// Int3 Path
				if (int3 == 9)
				{
					n += "XC";
					int3 = int3 - 9;
				}
				if (int3 == 4)
				{
					n += "XL";
					int3 = int3 - 4;
				}
					if (int3 >= 5 && int3 <= 8)
					{
						n += "L";
						int3 = int3 - 5;
					}
					while (int3 > 0 && int3 <5)
					{
						n += "X";
						int3--;
					}
					
				// Int 4 Path
				if (int4 == 9)
				{
					n += "IX";
					int4 = int4 - 9;
				}
				if (int4 == 4)
				{
					n += "IV";
					int4 = int4 - 4;
				}
					if (int4 >= 5 && int4 <= 8)
					{
						n += "V";
						int4 = int4 - 5;
					}
					while (int4 > 0 && int4 < 5)
					{
						n += "I";
						int4--;
					}
			System.out.println(n);		
			
		}
		
		else if (inputStr.length() == 3)
		{
			String first = inputStr.substring(0,1);
			String second = inputStr.substring(1,2);
			String third = inputStr.substring(2,3);
			
			int int1 = Integer.parseInt(first);
			int int2 = Integer.parseInt(second);
			int int3 = Integer.parseInt(third);
			
			// Int 1 Path
			if (int1 == 9)
			{
				n += "CM";
				int1 = int1 - 9;
			}
			if (int1 == 4)
			{
				n += "CD";
				int1 = int1 - 4;
			}
				if (int1 >= 5 && int1 <= 8)
				{
					n += "D";
					int1 = int1 - 5;
				}
				while (int1 > 0 && int1 <5)
				{
					n += "C";
					int1--;
				}
				
			// Int2 Path
			if (int2 == 9)
			{
				n += "XC";
				int2 = int2 - 9;
			}
			if (int2 == 4)
			{
				n += "XL";
				int2 = int2 - 4;
			}
				if (int2 >= 5 && int2 <= 8)
				{
					n += "L";
					int2 = int2 - 5;
				}
				while (int2 > 0 && int2 <5)
				{
					n += "X";
					int2--;
				}
				
			// Int 3 Path
			if (int3 == 9)
			{
				n += "IX";
				int3 = int3 - 9;
			}
			if (int3 == 4)
			{
				n += "IV";
				int3 = int3 - 4;
			}
				if (int3 >= 5 && int3 <= 8)
				{
					n += "V";
					int3 = int3 - 5;
				}
				while (int3 > 0 && int3 < 5)
				{
					n += "I";
					int3--;
				}
				System.out.println(n);
				
		}

		else if (inputStr.length() == 2)
		{
			String first = inputStr.substring(0,1);
			String second = inputStr.substring(1,2);
			
			int int1 = Integer.parseInt(first);
			int int2 = Integer.parseInt(second);

						// Int1 Path
						if (int1 == 9)
						{
							n += "XC";
							int1 = int1 - 9;
						}
						if (int1 == 4)
						{
							n += "XL";
							int1 = int1 - 4;
						}
							if (int1 >= 5 && int1 <= 8)
							{
								n += "L";
								int1 = int1 - 5;
							}
							while (int1 > 0 && int1 <5)
							{
								n += "X";
								int1--;
							}
							
						// Int 2 Path
						if (int2 == 9)
						{
							n += "IX";
							int2 = int2 - 9;
						}
						if (int2 == 4)
						{
							n += "IV";
							int2 = int2 - 4;
						}
							if (int2 >= 5 && int2 <= 8)
							{
								n += "V";
								int2 = int2 - 5;
							}
							while (int2 > 0 && int2 < 5)
							{
								n += "I";
								int2--;
							}
							System.out.println(n);
		}
		
		else if (inputStr.length() == 1)
		{
			String first = inputStr.substring(0,1);

			int int1 = Integer.parseInt(first);
			
			// Int 1 Path
			if (int1 == 9)
			{
				n += "IX";
				int1 = int1 - 9;
			}
			if (int1 == 4)
			{
				n += "IV";
				int1 = int1 - 4;
			}
				if (int1 >= 5 && int1 <= 8)
				{
					n += "V";
					int1 = int1 - 5;
				}
				while (int1 > 0 && int1 < 5)
				{
					n += "I";
					int1--;
				}
				System.out.println(n);
		}

		else 
		{
			System.out.println("Invalid integer");
		}

	}

}
