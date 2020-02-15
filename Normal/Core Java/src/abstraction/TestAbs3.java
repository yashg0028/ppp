package abstraction;


abstract class Abst{					//abstract class
	abstract void add();			//abstract method
	void sub() {					//concrete method
		System.out.println("subtraction");
	}
	
}

class B extends Abst{
	void add()								//implementation of abstract method
	{System.out.println("addition1");}		//void sub is concrete thus it is already taken into B
	
}

class c extends Abst{
	void add()
	{System.out.println("addition2");}
}


public class TestAbs3 {
	public static void main(String args[])
	{
		Abst a =new B();
		a.add();
		a.sub();
		Abst b=new c();
		b.add();
		b.sub();
		
	}

}
