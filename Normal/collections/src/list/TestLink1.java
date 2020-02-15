package list;
import java.util.*;
public class TestLink1 {
	public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  // add elemnts to array.
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }  
    }  

}
