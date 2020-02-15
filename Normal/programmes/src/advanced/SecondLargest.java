package advanced;


public class SecondLargest {
	 
	public static void main(String[] args) {
 
		int a[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int largest = a[0];
		int secondLargest = a[0];
		System.out.println("The given array is:"  );
		for (int i =0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 1; i < a.length; i++) {
 
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
 
			} else if (a[i] > secondLargest) {
				secondLargest = a[i];
 
			}
		}
 
		System.out.println("Second largest number is:" + secondLargest);
 
	}

}
