class AA extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("A"+i);
		}
	}
}
class BB extends Thread {
	public void run() {
		
		for(int i=1;i<=10;i++) {
			if (i==10) System.exit(0);
			System.out.println("B"+i);
		}
	}
		
}
class CC extends Thread {
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("C"+i);
		}
	}
}
public class MultithreadingEx2 {
	public static void main(String[] args) {
		System.out.println("Hello Main");
		AA a=new AA();
		a.start();
		a.setPriority(Thread.MIN_PRIORITY);
		//System.out.println("Hi Main");
		BB b=new BB();
		b.start();
	//	b.setPriority(Thread.MAX_PRIORITY);
	//	System.out.println("Ok Main");
		CC c=new CC();
		c.start();
	//	System.out.println("Bye Main");
	}
}
