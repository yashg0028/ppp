package staticAndFinal;

class  Method{
	static int a;
	static int b;
	 String c;
	 String d;
	 
	
	static void add(int a,int b)				//Static Method Declaration
	{
		int d=a+b;
		System.out.println(d);
		
	}
	public void add1(String c,String d) 			//Public Method Dec
	{
	String e =c+d;
	System.out.println(e);
	
	}
	
}
public class TestMethod3 {

	public static void main(String[] args) {
		Method.add(20, 60);				//Calling add method and passing values into it
										//static method must be called with the help of method name
		Method m=new Method();			//regular method called using instance
		m.add1("RTR", "POP");
	}

}
