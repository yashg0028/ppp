package staticAndFinal;


public class TestFinal2 {	
	
		  final void run(){System.out.println("running");}  
		}  
		     
		class Honda extends TestFinal2{  
		 //  void run()
		   {
			   System.out.println("running safely with 100kmph");
		}  
		     
		   public static void main(String args[]){  
		   Honda h= new Honda();  
		   h.run();  
		   }  
		}  

