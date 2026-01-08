
public class ExceptionHandlingEx6 {
public static void main(String[] args) {
	int x=15, y=0,z=0;
	try {
		z= x/y;
		System.out.println("division"+ z);
	}
	catch(ArithmeticException e)//runtime , exception, throwable all are parent of Arithmetic exception
	{
		System.out.println("jhhgaguadkakiq");
		System.out.println("Arithmetic");
		System.out.println(e);
	}
	catch(Exception e) {
		System.out.println("ishiatjkkj");
		System.out.println(e);
	}
}
}
