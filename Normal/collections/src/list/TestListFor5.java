package list;
import java.util.*;
public class TestListFor5 {
	 public static void main(String args[]){  
	  ArrayList<String> al=new ArrayList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	   											//Traversing list through for-each loop  
	  /*for(String obj:al)  
	    System.out.println(obj);*/  
	 
	 Iterator<String> itr1=al.iterator();
	 while(itr1.hasNext())
	 {
		 System.out.println(itr1.next());
		// itr1.remove();
		 
	 }
	 System.out.println(al);
	 }  
	
}
