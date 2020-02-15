package operators;

public class Logic3 {

	public static void main(String[] args) {
		int a=10;  
		int b=5;  
		int c=20;  
		
		//Logical AND -- If 1st is true 2nd will not be checked
		System.out.println(a>b || a<c);//true || true = true
		
		//Bitwise AND -- both will be checked
		System.out.println(a>b | a<c);//true | true = true  
		 
		//Logical AND -- If 1st is true 2nd will not be checked
		System.out.println(a>b || a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked 
		
		//Bitwise AND -- both will be checked
		System.out.println(a>b | a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked
	}

}
