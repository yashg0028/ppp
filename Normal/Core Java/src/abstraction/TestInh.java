package abstraction;



interface  Printable{  		//interface class with method print()
	void print();  
	}  

class A6 implements Printable   // here A6 child class implements interface 
{  
	public void print()
	{
		System.out.println("Hello2"); //declaring values in print()
}  
}
 class TestInh 				
{	
	public static void main(String args[]){  
		Printable obj = new A6();  //instance of child class calls method
		obj.print();  
		 }  
		}  
//o/p:: Hello2