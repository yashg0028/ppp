package pop;


/*In this example the class Test which is present in another package 
 * is able to call the addTwoNumbers() method, which is declared protected. 
 * This is because the Test class extends class Addition and the protected modifier 
 * allows the access of protected members in subclasses (in any packages).

Addition.java

package abcpackage;
public class Addition {

   protected int addTwoNumbers(int a, int b){			//addTwoNumbers method
	return a+b;
   }
}

// other package
Test.java

package xyzpackage;
import abcpackage.*;		//importing abcpackage and its protected method addmethod()
class Test extends Addition{			
   public static void main(String args[]){
	Test obj = new Test();
	System.out.println(obj.addTwoNumbers(11, 22));
   }
}
Output:

33*/





public class TestProtec {

}
