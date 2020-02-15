package programmes;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramHashmap {
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        // Getting the input string from the user
	        System.out.print("Enter the First String : ");
	        String s1 = scanner.nextLine();
	        System.out.print("Enter the second String : ");
	        String s2 = scanner.nextLine();
	        if (checkAnagram(s1, s2))
	            System.out.println(s1 + " and " + s2 + " are Anagrams");
	        else
	            System.out.println(s1 + " and " + s2 + " are NOT Anagrams");
	        scanner.close();
	    }

	    public static boolean checkAnagram(String s1, String s2)
	    {
	        if (s1.length() != s2.length())
	            return false;
	        
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        
	        for (int i = 0; i < s1.length(); i++)
	        {
	            char c = s1.charAt(i);
	            if (map.containsKey(c))
	                map.put(c, map.get(c) + 1);
	            else
	                map.put(c, 1);
	        }
	        for (int i = 0; i < s2.length(); i++)
	        {
	            char c = s2.charAt(i);
	            if (map.containsKey(c))
	            {
	                if (map.get(c) == 1)
	                    map.remove(c);
	                else
	                    map.put(c, map.get(c) - 1);
	            } else
	                return false;
	        }
	        if (map.size() > 0)
	            return false;
	        return true;
	    }
	}
	
	
	
	
	
