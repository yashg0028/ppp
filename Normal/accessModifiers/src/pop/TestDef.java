					//default - only within PACKAGE
package pop;  

/* 
class A{  		//default class
void msg(){System.out.println("Hello");} //default method
  
}  
///////
 
package mypack;  
import pop.*;  
class B{  
  public static void main(String args[]){  
   A obj = new A();		//Compile Time Error  
   obj.msg();			//Compile Time Error  
  }  
} */ 

//In the above example, the scope of class A and its method msg() is default 
//so it cannot be accessed from outside the package.


 class TestDef 
{

}
