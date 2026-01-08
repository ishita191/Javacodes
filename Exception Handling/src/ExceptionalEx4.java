
public class ExceptionalEx4 {
public static void main(String[] args) {
	System.out.println("hello");
	int a=10, b=2, c=0;
	try {
		c= a/b;
		System.out.println("Division "+c);
		int x[]= {1,3,4,5,5,5,6};
			System.out.println(x[9]);
	
	}
	catch(ArithmeticException s)
	{
		System.out.println("errror");
	}
	catch(ArrayIndexOutOfBoundsException d) {
		System.out.println("array error ");
	}
}
}
