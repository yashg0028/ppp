package advanced;

public class SmallestNumber 
{
	public static void main(String[] args) {
		 int a[] = new int[]{12,44,23,56,9,23,78,13};
	       int min = a[0];
	       for(int i =1; i < a.length; i++)
	       {
	            if(a[i]<min)
	            {
	                min = a[i];

	            }
	        }

	        System.out.println(" Smallest value in a given array is  :  "+min);
	}
	

}

