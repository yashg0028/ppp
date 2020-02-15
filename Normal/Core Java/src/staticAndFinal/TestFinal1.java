package staticAndFinal;

class Bike9
{  
	 final int speedlimit=90;//final variable  
	 void run()
	 {  
	//  speedlimit=90;  // Prog cannot be executed
	 }  
}
public class TestFinal1 {

	public static void main(String[] args) {
			 Bike9 obj=new  Bike9();  
			 obj.run();
		
	}  

}
