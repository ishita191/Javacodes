public class InputEx2 {
public static void main(String args[])
{
	java.util.Scanner t =new java.util.Scanner(System.in);
	System.out.println("Enter a temperature Value:");
	java
	double celsius=t.nextDouble();
	double F=(celsius*9/5)+32;
	System.out.println("Temperature is in Farenhite:"+F);
}
}
