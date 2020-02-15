package staticAndFinal;

class Methodd5 {
	 int a=20;
	 int b=20;
	 int c=20;
	 int d;
	 
	public int add() 
								// in method variables and their values must not be declared.only logic has to be declared
{
	d=a+b+c;					//integer data type method cannot be used void data type,so used int method first 
								//and then used void display method to print the result.		
   return d;
	 }
void display() {
	  System.out.println(d);
	 }
}
class TestMethod4{
public static void main(String args[]) {
	Methodd5 s1 = new  Methodd5();
	  s1.display();
	 }
	}

