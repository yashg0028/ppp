package map;
import java.util.*;
public class TestHashMap1 {
	public static void main(String[] args) {
   
	HashMap<String, Integer> m=new HashMap<String, Integer>();
		m.put("Chiranjeevi", 700);
		m.put("Balaih", 800);
		m.put("Venkatesh", 200);
		m.put("Nagarjuna", 500);
	System.out.println(m);	
	System.out.println(m.put("Chiranjeevi",1000 ));
	
	Set s=m.keySet();
	System.out.println(s);
	
	Collection c=m.values();
	System.out.println(c);
	
	Set s1=m.entrySet();
	System.out.println(s1);
	
	Iterator itr=s1.iterator();
	while(itr.hasNext())
	{
		Map.Entry m1=(Map.Entry)itr.next();
		System.out.println(m1.getKey()+"  "+m1.getValue());
		
		if (m1.getKey().equals("Nagarjuna"))
		{
			m1.setValue(1000);
		}
	}
	
	System.out.println(m);
	}}