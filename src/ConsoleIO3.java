import java.util.Scanner;

public class ConsoleIO3 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	

System.out.println("Enter a String:");
String a= sc.nextLine();
		System.out.println("String :"+a);
	
//enter a no
		
	System.out.println("Enter a no:");
	int b=sc.nextInt();
	System.out.println("Number print:"+b);
	//enter float
System.out.println("float no");
double c=sc.nextDouble();
System.out.println("double"+c);
//again string
sc.nextLine();
String aa= sc.nextLine();
System.out.println("srig"+aa);
	sc.close();
	
	
	
}
}
