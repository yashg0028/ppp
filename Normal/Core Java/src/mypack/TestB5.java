package mypack;


public class TestB5 {
	
	public static void main(String args[]) {
		pack.Cal1 c1=new pack.Cal1();			//using fully qualified name of class instead of import keyword
		pack.Cal3 c3=new pack.Cal3();
		System.out.println(c1.add(1, 1));
		System.out.println(c3.mul(15, 15));
	
	}
}
