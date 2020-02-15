package abstraction;

abstract class Bank
{    
abstract int getRateOfInterest();    
}    

class SBI extends Bank
{    
int getRateOfInterest()										//2child classes and needed two instances to call abstract methods
{
	return 7;
}    
}    
class PNB extends Bank
{    
int getRateOfInterest()
{
	return 8;
}    
}    
    
public class TestAbs2 {
public static void main(String args[]){   
	Bank b=new SBI();  
	Bank b1=new PNB();  

System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
System.out.println("Rate of Interest is: "+b1.getRateOfInterest()+" %");    
}
}    


 
