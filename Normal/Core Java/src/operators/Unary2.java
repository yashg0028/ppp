package operators;

public class Unary2 {
							// Java program to illustrate 
							// unary operators 
		public static void main(String[] args) 
		{ 
			int a = 20, b = 10, c = 0, d = 20, e = 40; 
			boolean condition = true; 

			// post-increment operator value is used in calculation and then incremented .20(printed) (21)(taken for further step calculation) 
			c = a++; 
			System.out.println("Value of c (a++) = " + c);
			
			c=++a;// pre increment hence value is first incremented and then computed input available is a=21()printed output:22 
			System.out.println("Value of c (++a) = " + c); 
//pre  inc input (23)(23)
			c = ++a; 
			System.out.println("Value of c (++a) = " + c);
			// pre increment operator 11 (11)
			
			c = ++b; 
			System.out.println("Value of c (++b) = " + c); 
			
			//post increment(11)(printed)(12)(input to next calculation)
			
			c = b++; 
			System.out.println("Value of c (b++) = " + c);
			
			// pre-decrement operator (19) (19)
			
			c = --d; 
			System.out.println("Value of c (--d) = " + c); 

			// post decrement operator (19)printed (20)calculated further
			c = d--; 
			System.out.println("Value of c (d--) = " + c); 

			
			// post-decrement operator (40)printed (39)calculated further
			c = e--; 
			System.out.println("Value of c (e--) = " + c); 

			// Logical not operator 
			System.out.println("Value of !condition ="
							+ !condition); 
		} 
	} 


