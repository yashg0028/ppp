package pop;


/*package abcpackage;  //first package

public class Addition {
   /* Since we didn't mention any access modifier here(method), it would
    * be considered as default.
    
   int addTwoNumbers(int a, int b){
	return a+b;
   }
} 
*/


/*package xyzpackage;

/* We are importing the abcpackage
 * but still we will get error because the
 * class we are trying to use has default access
 * modifier.
 
import abcpackage.*;
public class Test {
   public static void main(String args[]){
	Addition obj = new Addition();
        /* It will throw error because we are trying to access
         * the default method in another package
 
	obj.addTwoNumbers(10, 21);
   }
}*/


/*op:
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
The method addTwoNumbers(int, int) from the type Addition is not visible
at xyzpackage.Test.main(Test.java:12)*/


public class TestDef1 {

}
