package multi;

class MyThread1 extends Thread{
	public void run() {
		System.out.println("Run method executed by thread: "+Thread.currentThread().getName());
	}
}
public class TestMulti3 {
public static void main(String args[])
{
	MyThread1 t=new MyThread1();
	t.start();
	System.out.println("Main method executed by thread: "+Thread.currentThread().getName());
}
}
