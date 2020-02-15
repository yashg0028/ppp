package list;
import java.util.*;

public class TestListFor3 {
	public static void main(String args[]){
	List <Integer> s1=new ArrayList <Integer>();//Generic type
	s1.add(7);						//add element to array list
	s1.add(56);
	System.out.println(s1);
	s1.add(87);
	s1.add(1, 78);					//add element in specific index
	System.out.println(s1);
	s1.set(2, 96);					//replace  2nd index 
	System.out.println(s1);
	System.out.println(s1.get(2)); //TO  RETRIEVE INDEX NUMBERED 2
	System.out.println(s1.size()); //to get size of array.
}
}
