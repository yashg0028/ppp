package mypack;

import pack.mul.TestMul;
public class TestB6SUsingSubPack
{
	public static void main(String args[])
	{
		//pack.mul.TestMul t=new pack.mul.TestMul();		//using fully qualified name
		TestMul t1=new TestMul();							//importing package along with subpackage
		//System.out.println(t.mul(5, 5));
		System.out.println(t1.mul(15, 5));

	}
}
