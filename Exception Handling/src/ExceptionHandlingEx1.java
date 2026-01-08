public class ExceptionHandlingEx1 {
public static void main(String[] args) {
	System.out.println("Ishita");
	int a = 3, b = 0, r = 0;
	try {
		r = a / b;
		System.out.println("Division: " + r);
	}catch (ArithmeticException e ){
		System.out.println("Exception Aayo re!");
	}
	System.out.println("Bye");
}
}