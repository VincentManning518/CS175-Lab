
public class multiplactionTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int alpha = 1;
		int i = 1,j = 1;
		
		while (alpha <= 10)
		{
			while (j <= 10)
			{
				int res0 = i * j;
				System.out.printf("%5s", res0);
				j++;
			}
			System.out.println();
			j = 1;
			i++;
			alpha++;
			
		}
		
	}

}
