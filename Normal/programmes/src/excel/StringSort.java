package excel;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSort {
	
		public static void main(String[] args) throws Exception {

			String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
					"aug", "Sep", "Oct", "nov", "Dec" };
		

			// Display input un-sorted list.
			System.out.println("-------Input List-------");
			showList(inputList);

			// Call to sort the input list.
			Arrays.sort(inputList);

			// Display the sorted list.
			System.out.println("\n-------Sorted List-------");
			showList(inputList);

			// Call to sort the input list in case-sensitive order.
			System.out.println("\n-------Sorted list (Case-Sensitive)-------");
			Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);

			// Display the sorted list.
			showList(inputList);
		}

		public static void showList(String[] inputList) 
		{
			
			for (String str : inputList) 
			{
				System.out.print(str + " ");
			}
			System.out.println();
		}

	}
