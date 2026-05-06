class AB extends Thread{
	public void run() {
		System.out.println("Hello World");
		System.out.println("Hello World1");
		
	}
}
class BC extends Thread{
	public void run() {
		System.out.println("hello world eternal coder");
		System.out.println("hello world eternal coder");
		System.out.println("hello world eternal coder");
		System.out.println("hello world eternal coder");
		System.out.println("hello world eternal coder");	
	}
}
class CD extends Thread{
	public void run()
	{
		System.out.println("eternal coder");
		System.out.println("eternal coder");
		System.out.println("eternal coder");
		System.out.println("eternal coder");

	}
}
public class MulthreadingEx1{
	public static void main(String[] args) {
		System.out.println("---heelo---");
		AB ab =new AB();
		Thread t1= new Thread(ab);
		t1.start();
		BC bc = new BC();
		Thread t2= new Thread(bc);
		t2.start();
		CD cd = new CD();
		Thread t3= new Thread(cd);
		t3.start();
		
	
	}
}