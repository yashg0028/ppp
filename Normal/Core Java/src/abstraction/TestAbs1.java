package abstraction;

abstract class Bike{  
										//Absract class
	abstract void run();  				//Absract method
	
}  

class Honda4 extends Bike{  		//extending of abstract class
									//implementing of abstract method
	void run()
	{
		System.out.println("running safely");

	}  
	
}
public class TestAbs1 {

	public static void main(String args[]){  
	 Bike obj = new Honda4();  			//abstract class varname = new childclass();
	 obj.run();  						//calling abstract method with  the instance of childclass.  
	}  
	}  

