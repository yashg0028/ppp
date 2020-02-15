package multi;

class MyThread2 extends Thread{}
	

public class TestPriortity {
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(15);
		Thread.currentThread().setPriority(8);
		MyThread2 t=new MyThread2();
		System.out.println(t.getPriority());
	}

}
