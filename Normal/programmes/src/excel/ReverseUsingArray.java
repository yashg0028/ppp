package excel;

public class ReverseUsingArray 
{
		public static void main(String[] args) 
		{
			String str = "Saket Saurav";
			char c[] = str.toCharArray();  // converted to character array and printed in reverse order
					for(int i= c.length-1; i>=0; i--)
					{
							System.out.print(c[i]);
			}
		}
}
