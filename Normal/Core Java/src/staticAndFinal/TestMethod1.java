package staticAndFinal;
class Practice{
	int a,b,c;
	public int add(int a,int b)		//	
	{
		c=a+b;
		return c;
	}
}

public class TestMethod1 {

	public static void main(String[] args) {
		Practice p=new Practice();				// creating an instance of Addition class  

		System.out.println(p.add(70, 80));    // calling addTwoInt() method to add two integer using instance created 

		
	}

}
