
public class CalculatorSwitch {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.println("Enter a no:");
	
int a= sc.nextInt();
switch(a) {
case 1: 
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
default:
	System.out.println("invalid number");
	break;
case 4:
	System.out.println("Thursday");
case 5:
	System.out.println("Friday");
case 6: 
	System.out.println("Saturday");
break;
case 7:
	System.out.println("Sunday");

}
System.out.println("thank you");

	                  
}
}
