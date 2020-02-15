package excel;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Automation";
		/*StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2.reverse();					// using string builder to reverse
		System.out.println(str2);
		*/

  // String reverse = new StringBuilder(str).reverse().toString();
		
		String reverse=new StringBuffer(str).reverse().toString();
 
		System.out.println("reverse: "+reverse);
	}

}
