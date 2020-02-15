package staticAndFinal;

class Practtice{
	int a,b,c;
	
	public void  add(int a,int b)
	{
		c=a+b;
		System.out.println("addition of a,b : "+c);
	}
}

public class TestMethod2 {

	public static void main(String[] args) {
		Practtice p=new Practtice();
		p.add(10,20);
	}

}
