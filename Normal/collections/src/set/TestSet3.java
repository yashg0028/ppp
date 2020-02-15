package set;
import java.util.*;
public class TestSet3 {
public static void main(String args[]){  
		   ArrayList<String> list=new ArrayList<String>();  
		           list.add("Ravi");  
		           list.add("Vijay");  
		           list.add("Ajay1");  
		             
		   HashSet<String> set=new HashSet<String>(list);  //here hashset takes elements of arraylist
		           set.add("Gaurav");  				//and prints them with the help of iterator
		   Iterator<String> i=set.iterator();  
		           while(i.hasNext())  
		           {  
		        //String s=(String)i.next();
		          System.out.println(i.next());
		          i.remove();
		      }
		           System.out.println(set);

}}
