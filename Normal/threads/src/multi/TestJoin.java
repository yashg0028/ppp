package multi;
class MyThread6 extends Thread
{
	public void run() 
	{
	for (int i=0;i<10;i++)
	{
	System.out.println("child thread");	
	try {
	Thread.sleep(2000);
	}catch(InterruptedException e) {}
}
}}
 class TestJoin {

	public static void main(String[] args) throws InterruptedException
	{
		
	MyThread6 t4=new MyThread6();
	t4.start();
	t4.join();
	for(int i=0;i<10;i++)
	{
		System.out.println("main thread");
	}
	}

  }
