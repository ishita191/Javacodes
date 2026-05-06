class AAA extends Thread{
	public void run()
	{
		System.out.println("method 1");
		System.out.println("method 2");
		try {  Thread.sleep(5000);
			System.out.println("happ");
		}
		catch(InterruptedException e)
		{
			System.out.println("happy");
		}
		System.out.println("ishita");
	}
	 
}
class BBB extends Thread{
	public void run()
	{
		System.out.println("panchal");
		System.out.println("ishita");
		stop();
		
		System.exit(0);
	}
}
public class MultithreadingEx3 {
public static void main(String[] args) {
	AAA aaa= new AAA();
	aaa.start();
}
}
