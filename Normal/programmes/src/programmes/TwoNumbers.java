package programmes;

import java.util.Scanner;

public class TwoNumbers {
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int x, y, temp;
			System.out.println("Enter x and y");
			Scanner in = new Scanner(System.in);
			//in.close();
			x = in.nextInt();
			y = in.nextInt();
			System.out.println("Before Swapping: " +x+ " and " +y);
			temp = x;
			x = y;
			y = temp;
			System.out.println("After Swapping: " +x+ " and " +y);
			
		}

	}


