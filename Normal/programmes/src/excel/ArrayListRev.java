package excel;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListRev {

	
	// Java program to demonstrate 
	// How to sort ArrayList in descending order 


		public static void main(String args[]) 
		{ 

			// Get the ArrayList 
			ArrayList<String> 	list = new ArrayList<String>(); 

			// Populate the ArrayList 
			list.add("Geeks"); 
			list.add("For"); 
			list.add("ForGeeks"); 
			list.add("GeeksForGeeks"); 
			list.add("A computer portal"); 

			// Print the unsorted ArrayList 
			System.out.println("Unsorted ArrayList: "	+ list); 
	    
			//  Collections.sort(list);
	        System.out.println("Sorted Array : " +list);

			// Sorting ArrayList in descending Order 
			// using Collection.sort() method 
			// by passing Collections.reverseOrder() as comparator 
	       Collections.sort(list,Collections.reverseOrder());

			// Print the sorted ArrayList 
			System.out.println("Sorted ArrayList in Descending order : "+ list);
		} 
	} 

	