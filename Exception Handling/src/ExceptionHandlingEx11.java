class y{
	String x;
	void n() {
		System.out.println("hello");
	}
}
public class ExceptionHandlingEx11 {
public static void main(String[] args) {
	
	
	try{
		y i= null;
		i.n();
		
	}catch(NullPointerException e)
	{
		System.out.println(e);
	}
	}}