package mypack;				//import one class(TestA.java) from another package-pack
import  pack.TestA;
public class TestB {

	public static void main(String[] args) {
		TestA a1=new TestA();
		 a1.msg();
	}

}
