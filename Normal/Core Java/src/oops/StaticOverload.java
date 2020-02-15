package oops;

public class StaticOverload 
{
	static void add(int a,int b)   
	{
	int c=a+b;
	System.out.println(c);
	}
	static void add(int a,int b,String c)
	{
		System.out.println(a+" "+b+" "+c);
	}
	void add(int a,String b,int c)
	{
		System.out.println(a+" "+b+" "+c);
	}
		
		public static void main(String[] args) 
		{
			StaticOverload.add(10,20);
			StaticOverload.add(10,20,"raj");
			StaticOverload t1=new StaticOverload();
        t1.add(25, "qwe", 12);

	}

}
