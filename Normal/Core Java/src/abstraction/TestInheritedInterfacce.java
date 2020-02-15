package abstraction;

interface Inf1
{  
void print();  
}  

interface Inf2 extends Inf1
{  
void show();  
}  

class Demo2 implements Inf2

 /* Even though this class is only implementing the
    * interface Inf2, it has to implement all the methods 
    * of Inf1 as well because the interface Inf2 extends Inf1
    */

{  
public void print()
{
	System.out.println("Hello1");
}  
public void show()
{
	System.out.println("Welcome1");
}
}
public class TestInheritedInterfacce 
{
public static void main(String args[])
{  
	Inf2 obj = new Demo2(); 
	//Demo2 obj=new Demo2();		//here exteded interface or implemented class can be used//
obj.print();  
obj.show();  
 }  
}  

