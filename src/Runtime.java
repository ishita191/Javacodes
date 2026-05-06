/*run time method overriding
same signature , method must be non static , access modifier same or strong ,inheritance is compulsory
*/
class D{
	int x=10;
	static int h=20;
	 void m1() {
		System.out.println("hello");
	}
	 static void m2()
	{
		System.out.println("hii b");
	} 
}
class  E extends D{
	
 int x=20;
public void m1(){
		System.out.println("hii A");
	}
	
}
public class Runtime {
public static void main(String[] args) {
	D b =new D();
	b.m1();
	
}
}
