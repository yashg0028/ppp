package programmes;

import java.util.Scanner;

public class Prime {
	public static boolean isPrime(int num)
	{
		for (int i=2;i<num/2;i++)
		{
			if (num%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[])
	
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		num = sc.nextInt();
		if ( isPrime(num))
		{
			System.out.println("Prime Num : " +num);
		}
else
		{
			System.out.println("Not Prime : " +num);
			
		}}}