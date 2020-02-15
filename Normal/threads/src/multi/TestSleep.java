package multi;
	class MyThread7 extends Thread
	{
		public void run() 
		{
		for (int i=0;i<10;i++)
		{
		try {
			Thread.sleep(2000);}
		catch(InterruptedException e) {}
		System.out.println("child thread");	
		
	}
	}
}
	public class TestSleep {
		 public static void main(String args[]){  
			 MyThread7 t1=new MyThread7();  
			 MyThread7 t2=new MyThread7();  
			   
			  t1.start();  
			  t2.start();  
			 }  
	}
