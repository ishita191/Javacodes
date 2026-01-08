public class ExceptionHandlingEx12 {
public static void main(String[] args) {
	try {
		
        int[] a = new int[100000000];
        System.out.println(a[1000000000]);
	}
	catch(Exception e)
	{
		System.out.println("error");
	}
}
}
