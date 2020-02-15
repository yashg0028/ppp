package set;
import java.util.*;
public class TestSet1 
	{  
		public static void main(String[] args)  
		{  
		HashSet<String> hs= new HashSet<String>();   //Empty HashSet 
		hs.add("India");  				//adding elements
		hs.add("America");  
		hs.add("Russia1");  
		hs.add("China");  
		hs.add("India");  												//duplicate value  
		hs.add("Russia1");                           //duplicate value  
		System.out.println("Set is "+hs);           //view HashSet  
		Iterator<String> it=hs.iterator();           //add an iterator to hs  
		System.out.println("Elements using iterator:");  
		while(it.hasNext())                          //display elements by using iterator  
		{  
		//String s=(String)it.next();  
		System.out.println(it.next());  
		}  
		}  

}
