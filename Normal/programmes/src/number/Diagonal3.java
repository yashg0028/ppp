package number;

public class Diagonal3 {
	public static void main(String[] args) {
		
	for  (int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			if(i<=4 && j>i)
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
