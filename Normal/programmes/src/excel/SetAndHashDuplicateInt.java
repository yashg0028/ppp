package excel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetAndHashDuplicateInt {

	public static void main(String[] args)
	{
		int [] arr = {3,5,4,3,2,2,1,3,2};
		Map <Integer, Integer> hm = new HashMap<>();
		for (int no :arr)
		{
			Integer count =hm.get(no);
			if (count==null)
			{
				hm.put(no, 1);
			}
			else
			{
				count=count+1;
				hm.put(no, count);
			}
			
		}
	 Set<Map.Entry<Integer, Integer>> s = hm.entrySet();
	 for (Map.Entry<Integer, Integer> p1 :s)
	 {
		 if(p1.getValue()>1)
		 {
			 System.out.println(p1.getKey()+ " appeared  " +p1.getValue()+ " times ");
		 }
	 }
		
	}
	
}
