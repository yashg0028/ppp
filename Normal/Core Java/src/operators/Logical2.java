package operators;

public class Logical2 {

	public static void main(String[] args) {

		int a=10;  
		int b=5;  
		int c=20;  
		//Logical AND &&---- does not check 2ns STAT if 1St is false
		System.out.println(a<b  &&  a++<c);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  
		
		//Bitwise AND & --- Checks both the statements ||
		System.out.println(a<b  &  a++<c);//false && true = false  
		System.out.println(a);//11 because second condition is checked  
	}

}
