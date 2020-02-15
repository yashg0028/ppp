package excel;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayAscSort1 {
	

	     /* This class shows how to sort ArrayList in java
	     * @param args
	     */
	    public static void main (String[] args)
	    {
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        //using Collections.sort() to sort ArrayList
	        arr.add(9);
	        arr.add(10);
	        arr.add(11);
	        arr.add(7);
	        System.out.println("ArrayList : " +arr);
	        
	        Collections.sort(arr);
	        System.out.println("Ascending Sort: " +arr);
	        
	        Collections.sort(arr,Collections.reverseOrder());	    
	        System.out.println("Descending Sort :" );
	        for(Integer str: arr) 
	        System.out.print(" "+str);
	    }

	}


