package set;
import java.util.*;
public class TestSet5 {
public static void main(String[] args) {
			
												// Create a HashSet of String Objects
			HashSet<String> set1 = new HashSet<>();
			
			set1.add("hello");
			set1.add("abc");
			set1.add("time");
			set1.add("Hi");
			set1.add("abc");
			
											// Search for an element from Hash Set
			
			if(set1.contains("time"))
			{
				System.out.println("Yes Set contains the 'time' String");
			}
			
			if(set1.contains("table") == false)
			{
				System.out.println("No Set do not contains the 'table' String");
			}
			
		}

}
