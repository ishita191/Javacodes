public class ExceptionHandlingEx3 {
public static void main(String[] args) {
	int a=20, b=2, c=0;
	try {
		c= a/ b;
		System.out.println("Divide "+c);
		int x[]= {3,56,7,8,6,6};
		
		try {
			System.out.println(x[c]);
		}
		catch(ArrayIndexOutOfBoundsException ishita)
		{
			System.out.println("error h array ");
		}
		System.out.println("hello Ishita PAnchal");
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("error aayo re"); 
	}
}
}
