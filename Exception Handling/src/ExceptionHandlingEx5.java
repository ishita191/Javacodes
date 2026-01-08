public class ExceptionHandlingEx5 {
public static void main(String[] args) {
	int a=10, b=2, c=0;
	try {
		c= a/b;
		System.out.println(c);
		int x[]= {2,3,4,5,6,7,7};
		System.out.println(x[8]);
	}
	catch(Throwable e)
	//catch(Exception e)// ArrayindexoutofboundsException
	{
		System.out.println("errrpr");
	//System.out.println(e);
	      e.printStackTrace();
	      System.out.println(e.getMessage());
	}
	System.out.println("errrrrrroer");
}
}
