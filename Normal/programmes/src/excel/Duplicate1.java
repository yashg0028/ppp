package excel;

public class Duplicate1 {
	
	public static void main(String[] args) {
		 
	int[] a=    {8,9,6,8,9,5,2,5};
	  
	for (int i=0;i<=a.length-1;i++)
	{
		for (int j=i+1; j<=a.length-1;j++)
		{
			if( (a[i]== a[j]) && (i!=j))
			{
				System.out.print(a[j]+ " ");
			}
			
		}
	
	}
}
}