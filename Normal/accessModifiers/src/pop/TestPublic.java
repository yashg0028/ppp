package pop;


/*
Lets take the same example that we have seen above(in protected extension) 
but this time the method addTwoNumbers() has public modifier
 and class Test is able to access this method 
 without even extending the Addition class. 
 This is because public modifier has visibility everywhere.

Addition.java

package abcpackage;

public class Addition {

   public int addTwoNumbers(int a, int b){
	return a+b;
   }
}
Test.java

package xyzpackage;
import abcpackage.*;
class Test{
   public static void main(String args[]){
      Addition obj = new Addition();
      System.out.println(obj.addTwoNumbers(100, 1));
   }
}
Output:

101





*/
public class TestPublic {

}
