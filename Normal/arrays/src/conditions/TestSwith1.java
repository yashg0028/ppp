package conditions;

public class TestSwith1 {
	
	
	public static void main(String args[]){
	     int num=2;						// integer variable values to 2
	     switch(num+2)					//switch(expression)
	     {
	     case 1:
	    	 
		  System.out.println("Case1: Value is: "+num);
		
	     case 2:
		  System.out.println("Case2: Value is: "+num);
		
	     case 3:
		  System.out.println("Case3: Value is: "+num);
	     
	     default:
		  System.out.println("Default: Value is: "+num);
	      }
	}

}
//In switch I gave an expression, you can give variable also.
//I gave num+2, where num value is 2 and after addition the expression resulted 4.
//Since there is no case defined with value 4 the default case got executed. 
//This is why we should use default in switch case, so that if there is no case that matches
//the condition, the default block gets executed.