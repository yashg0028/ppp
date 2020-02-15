package conditions;

public class TestNest1 {
	
public static void main(String args[]){
       int num=70;
	if( num < 100 )
	{ 
     System.out.println("number is less than 100");
	}
     if(num > 250)
     {
   System.out.println("number is greater than 50");
	 }
     if(num > 50)
     {
   System.out.println("number is less than 150");
 
	}else {
	System.out.println("last statement");
	}
}
   }