package advanced;

public class LargestNumberIndex 
{
	public static void main(String[] args) 
	{

		int a[] = new int[] { 12, 44, 23, 56, 23, 78, 13 };

		int max = a[0];
		int index = 0;

		for (int i =1; i < a.length; i++) 
		{
			if (a[i]> max) 
			{
				max = a[i];
				index = i;
			}
		}

		System.out.println("Index position of Maximum value in an array is  :  " + index);
} 
}
