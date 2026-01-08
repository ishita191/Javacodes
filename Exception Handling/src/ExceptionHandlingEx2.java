
public class ExceptionHandlingEx2 {
public static void main(String[] args) {
	System.out.println("Example array");
	int a[]= {7,8,9,56,6,4,6};
	try {
		System.out.println(a[3]);
      }
	catch(ArrayIndexOutOfBoundsException b)
	{
		System.out.println("Array index exception hai");
	}
	
}
}
