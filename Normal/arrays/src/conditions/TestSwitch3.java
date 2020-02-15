package conditions;

public class TestSwitch3 {
	
	public static void main(String args[]){
	      int i=2;
	      switch(i)
	      {
		 case 1:
		   System.out.println("Case1 ");
		 case 2:
		   System.out.println("Case2 ");
		 case 3:
		   System.out.println("Case3 ");
		 case 4:
	           System.out.println("Case4 ");
		 default:
		   System.out.println("Default ");
	      }
	   }

}
//In the above program, we have passed integer value 2 to the switch, 
//so the control switched to the case 2, 
//however we don’t have break statement after the case 2 that 
//caused the flow to pass to the subsequent cases till the end. 
//The solution to this problem is break statement