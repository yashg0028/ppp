package abstraction;

interface X
{
   public void myMethod();
}
interface Y
{
   public void myMethod();
}

/*
As you can see that the class implemented two interfaces.
A class can implement any number of interfaces. 
In this case there is no ambiguity even though both the interfaces are having same method.
Why? Because methods in an interface are always abstract by default, 
which doesn’t let them give their implementation (or method definition)in interface itself(used implementation class).

*/

class JavaExample implements X, Y		//class implementing two interfaces X,Y
{
   public void myMethod()
   {
       System.out.println("Implementing more than one interfaces");
   }
}
public class TestMultipleInher {

   public static void main(String args[]){
	   JavaExample obj = new JavaExample();	//classname var=new classname();
	   										//here 2interfaces are existing hence using classname to initialise object
	   obj.myMethod();
   }
}




