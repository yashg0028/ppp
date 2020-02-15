package mypack;			//declaring a package
/*import pack.Cal1;		// importing two classes cal1,cal2 from package pack to package mypack
import pack.Cal3;*/
import pack.*;			//importing All classes from package pack

public class TestB4{
	public static void main(String args[]) {
		Cal1 c1=new Cal1();
		Cal3 c3=new Cal3();
		System.out.println(c1.add(15, 15));
		System.out.println(c3.mul(10, 10));
		TestA a1=new TestA();
		 a1.msg();
	}
	
}
