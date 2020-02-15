package advanced;

public class Missing {
		 	 
		public static int missingNumber(int[] arr)
		{
			int n=arr.length+1;
			int expectedsum=(n)*(n+1)/2;
			int actualsum=0;
			for (int i =0; i < arr.length; i++) 
			{
				actualsum= actualsum+arr[i];
			}
			int missingNumber=expectedsum-actualsum;
			return missingNumber;
		}
		public static void main(String[] args) {
			 
			int[] arr1={7,5,6,1,4,2};
			System.out.println("Missing number from array arr1: "+missingNumber(arr1));
			int[] arr2={5,3,1,2};
			System.out.println("Missing number from array arr2: "+missingNumber(arr2));
	 
		}
		}