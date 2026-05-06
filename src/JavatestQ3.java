class P{
	P(){
		this(5);
		System.out.println("A");
	}
	P(int x)
	{
		System.out.println(x);
	}
}
class Q extends P{
	Q() {
		super();
		System.out.println("B");
}
	
}
public class JavatestQ3 {
   public static void main(String[] args) {
 Q obj= new Q();	
}
}
