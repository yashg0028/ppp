package set;
import java.util.*;			// to check insertion order
public class TestLinHashSet1 {

	public static void main(String args[]){  
		 							//Creating HashSet and adding elements  
		        LinkedHashSet<String> set=new LinkedHashSet<String>();  
		               set.add("One");    
		               set.add("Two");    //adding elements to LinkedHashSet
		               set.add("Three");   // following insertion order
		               set.add("Four");  
		               set.add("Five");  
		               
		  	           set.add("Raj");    
		               set.add("Yash");    //adding duplicate elements
		               set.add("Raj");   
		               set.add("Four");  
		               set.add("Yash");  
		            	                	            	    
		               Iterator<String> i=set.iterator();  
		               while(i.hasNext())  
		               {  
		               System.out.println(i.next());  
		               }  
		 }  

}
