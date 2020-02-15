package programmes;

import java.util.Scanner;

public class FactorialByRec {

	public static int CalFac(int num2) {
		int fact=1;
		if (num2 >=1)
		{
			fact =fact*1;
			CalFac(num2 - 1);
		}
		return fact;
		
	}
	 public static void main(String[] args)
	 {

		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter number: ");
		 int num2 =sc.nextInt();
		 sc.close();
		 CalFac(num2);
   
	 }

}
