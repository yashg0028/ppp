package list;
import java.util.*;  	//using both for each and iterator to print elements

public class TestListIterator4 {
public static void main(String args[]) {
	
	List<Integer> t1 = new ArrayList<Integer>();
	t1.add(85);
	t1.add(86);
	t1.add(87);
	//System.out.println(t1);
 
	Iterator itr1=t1.iterator();
	while(itr1.hasNext())
	{
		Integer  i=(Integer)itr1.next();
		System.out.println(i);

	}
	
	List <String> t2=new ArrayList<String>();
	t2.add("POP");
    t2.add("lol");
    t2.add("rty");
    t2.add("LOL");
    
    Iterator<String> itr2=t2.iterator();
    while(itr2.hasNext()) {
       	System.out.println(itr2.next());
    
       	itr2.remove();
    }
    System.out.println(t2);    
}	
}
