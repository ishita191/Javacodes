
public class ExceptionHandlingEx8 {
public static void main(String[] args) {
	try {
	int 	r=7/0;
		System.out.println("division"+r);
	}
	catch(NullPointerException e)
	{
		System.out.println("error");
	}
	finally {
		System.out.println("hello");
			}
}
}
