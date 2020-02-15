package advanced;

import java.util.Scanner;

public class Swap {

		   public static void main(String args[])
		   {
		      int x, y;
		      System.out.println("Enter x and y");
		      Scanner in = new Scanner(System.in);
		 
		      x = in.nextInt();
		      y = in.nextInt();
		 in.close();
		 
		      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
		 
		      x = x + y;
		      y = x - y;
		      x = x - y;
		 
		      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
		   }
		}




