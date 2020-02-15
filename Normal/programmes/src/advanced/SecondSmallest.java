package advanced;


public class SecondSmallest 
{
	public static void main(String[] args) 
	{
		 int[] a = {-5, -4, 0, 2, 10, 30, -3};
		    int smallest = 0;
		    int secondSmallest = 0;
		    for (int i = 0; i < a.length; i++) 
		    {
		        if(a[i]==smallest)
		        {
		          secondSmallest=smallest;
		        } 
		        else if (a[i] < smallest) 
		        {
		            secondSmallest = smallest;
		            smallest = a[i];
		        } 
		        else if (a[i] < secondSmallest) 
		        {
		            secondSmallest = a[i];
		        }

		    }
		    System.out.println(secondSmallest);
	}
}
