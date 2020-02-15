package multi;

class MyThread extends Thread
{
	public void run() 
	{
	for (int i=0;i<10;i++)
	{
	System.out.println("child thread");	
	}
}
}
public class TestMulti1 
{
	public static void main(String args[])
	{
	MyThread t1=new MyThread();
	t1.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("main thread");
	}
	}
	

}
