package multi;

class MyRunnable implements Runnable
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("child1");
		}
	}
}


public class TestMulti2 {
	public static void main(String args[])
	{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);		//passing runnable(r) object in thread object 
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main1");
		}
	}

}
