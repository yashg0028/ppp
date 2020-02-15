package multi;
class MyThread3 extends Thread{
	public void main()
	{
		for (int i=0;i<10;i++)
		{
		System.out.println("child thread");	
		}
	}
}
public class TestPriority1 {
	public static void main(String args[])
	{
		MyThread3 at=new MyThread3();
		at.setPriority(10);
		at.start();
		for (int i=0;i<10;i++)
		{
		System.out.println("main thread");	
		}
		
	}

}
