package map;
import java.util.*;
public class TestHashMap2 {
	
	 public static void main(String args[]) {

		 						/* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      								/*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      System.out.println(hmap);
	  ///**************    									/* Display content using Iterator*/
	      Set s = hmap.entrySet();
	      Iterator iterator = s.iterator();
	    
	    while(iterator.hasNext()) 
	    {
	         Map.Entry m = (Map.Entry)iterator.next();
	         System.out.println("key is: "+ m.getKey() + " & Value is: " +m.getValue());
	         
	      }

	      /* Get values based on key*/
	      
	      System.out.println("Value at index 2 is: "+ hmap.get(2));

	     /* Remove values based on key*/
	      hmap.remove(3);
	      
	      System.out.println("Map key and values after removal:");
	  //**********************
	      Set s2 = hmap.entrySet();
	      Iterator iterator2 = s2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry m2 = (Map.Entry)iterator2.next();
	          System.out.println("Key is: "+m2.getKey() + " & Value is: "+m2.getValue());
	       }

	   }

}
