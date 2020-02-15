package excel;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetAndHashDuplicateString {

public static void main  (String [] args) {
	 String word ="Programming";
	 
	char[] ch = word.toCharArray();
	Map<Character,Integer> m =new HashMap<Character,Integer>();
	
	for (Character a1:ch)
	{
		Integer count = m.get(a1);
		if (count== null)
		{
			m.put(a1, 1);
		}
			else 
			{
				count=count+1;
				m.put(a1, count);
				
			}
	}
		//*********************************//
		Set <Map.Entry<Character,Integer>> s =m.entrySet();
		for (Map.Entry<Character,Integer> p1:s)
		{
			if(p1.getValue()>1)
		
			{
				System.out.println(p1.getKey()+ " appeared "+p1.getValue()+ " times ");
			}
			/*else 
			{
				System.out.println(p1.getKey() +" is not duplicate");
			}*/
		}
	}
	
}

		
	
		