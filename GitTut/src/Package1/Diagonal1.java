package Package1;

public class Diagonal1 {
	
	for (int l=1;l<=1;l++)
	{
		
	System.out.println(l);

	}
	
public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i>=2 && j<=i-1)
				{
					System.out.print('-');
				}
				else
				{
					System.out.print("*");
					
				}
					
			}
			
			System.out.println();

		}

	}
}