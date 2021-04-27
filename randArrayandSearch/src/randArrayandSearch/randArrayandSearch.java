package randArrayandSearch;
import java.util.Arrays;
import java.util.Random;
public class randArrayandSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int LENGTH = 50;
		int [] random = new int[LENGTH];
		Random generator = new Random();
		
		for (int i = 0; i < LENGTH; i++)
		{
			random[i] = generator.nextInt(25) + 1;
		}
		
		System.out.println(Arrays.toString(random));

		int largestInt = 0, j = 0;
		for (int i = 0; i < LENGTH; i++)
		{
			
			if (j < random[i])
			{
				largestInt = random[i];
			}
			
			else if (j >= random[i])
			{
				largestInt = j;
			}
			j = largestInt;
		}
		
		System.out.println("Largest Integer: " + largestInt);
		
		int smallestInt = 1, p = 1;
		for (int i = 0; i < LENGTH; i++)
		{
			
			if (p > random[i])
			{
				smallestInt = random[i];
			}
			
			else if (p <= random[i])
			{
				smallestInt = p;
			}
			p = smallestInt;
		}
		
		System.out.println("Smallest Integer: " + smallestInt);
		
		int product = smallestInt * largestInt;
		System.out.println("Product of smallest and largest integers: " + product);
		
		int q = 0, counter = 0, freq = 0, mostFreq = 0; 
		for (int i = 0; i < LENGTH; i++)
		{
			q = random[i];
			for (i = 0; i < LENGTH; i++)
			{
				if (random[i] == q)
				{
					counter++;  //measures the frequency of the integer in the array
				}
			}
			if (counter >= freq)
			{
				mostFreq = q; // mostFreq -> most frequent integer in the array
			}
			
			else if (counter < freq)
			{
				mostFreq = mostFreq;
			}
			freq = counter;
		}
		
		System.out.println("The most frequent integer in the array is " + mostFreq + " and it appears " + freq + " times");
	}

}
