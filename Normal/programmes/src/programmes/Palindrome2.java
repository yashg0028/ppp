package programmes;
import java.util.Scanner;

public class Palindrome2 
{
	public static boolean IsPal( int number) {
		String Original=String.valueOf(number).toString();
		StringBuilder str = new StringBuilder();
		str.append(Original);
		str.reverse();
		String Reverse=str.toString();
		for (int i=0; i<Original.length(); i++)
		{
			
			if(Original.charAt(i)== Reverse.charAt(i))
				return true;
		}
		return false;
			
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int number =sc.nextInt();
		if (IsPal(number))       ///  calling above mentioned method as if conditional statement //
		{
			System.out.println("palindrome: "+number);
		}
		else {
			System.out.println("Not palindrome :" +number);
		}
	
}}
