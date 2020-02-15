package map;
import java.util.*;
public class TestHashMap3 {

	public static void main(String args[]){  
	HashMap<Integer,String> hm = new HashMap<Integer,String>();    
	System.out.println("Initial list of elements: "+hm);  
		      hm.put(100,"Amit");    
		      hm.put(101,"Vijay");    
		      hm.put(102,"Rahul");   
System.out.println("After invoking put() method: " +hm); 
 			Set s=	hm.entrySet();
 System.out.println(s);
////************************************
 			
 			for(Map.Entry m: hm.entrySet())
		     {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
	
////*********************		        
		    hm.put(103,"Gaurav");  			//putting to hm
		      System.out.println("After invoking put method: " +hm);  
		 for(Map.Entry m:hm.entrySet())			
		 {    
		           System.out.println(m.getKey()+" "+m.getValue());
         }  
///**************************
	
		 HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		 		hm1.put(104,"Yash");
		 		hm1.put(105,"POP");
		 		hm.putAll(hm1);			//adding entires from hm1 to hm
		 		System.out.println(hm);
	///**********************
		 		Set s2=hm.entrySet();		//creating s2 set with all entries at one place
		 		Iterator itr3=s2.iterator();
		 while(itr3.hasNext())
		 {
			Map.Entry m4=(Map.Entry)itr3.next();
			System.out.println(m4.getKey()+" "+m4.getValue());
			if (m4.getKey().equals(104)) ///implementing entry method using if loop
			{
				m4.setValue("LOL");
			}
		 }
		
		 hm.remove(105);
		 System.out.println(hm);
		 
		 hm.clear();
		 System.out.println(hm);
}}