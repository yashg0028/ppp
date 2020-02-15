package advanced;

public class LargestAndSecondLargest 
{
	public static void main(String[] args) 
	{
	
		int a[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		int maxOne = 0;
		int maxTwo = 0;
		for (int i=0;i<a.length; i++)
		{
			if (maxOne < a[i])
			{
				maxTwo = maxOne;
				maxOne = a[i];
			}
			else if (maxTwo < a[i])
			{
				maxTwo = a[i];
			}
		}
		System.out.println("Largest Number: " + maxOne);
		System.out.println("Second Largest Number: " + maxTwo);
	}

}
