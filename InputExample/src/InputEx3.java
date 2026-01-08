
public class InputEx3 {
public static void main(String args[])
{
	java.util.Scanner sc= new java.util.Scanner(System.in);
	System.out.print("Enter no of days:");
	int d=sc.nextInt();
	int Weeks=d/7;
	int remainingdays=d%7;
	System.out.println("Total no of weeks:"+Weeks);
	System.out.println("Remaining days:"+remainingdays);
	
	
	
}
}
