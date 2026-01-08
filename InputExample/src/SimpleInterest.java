
public class SimpleInterest {


public static void main(String [] args)
{
 java.util.Scanner sc=new java.util.Scanner(System.in);
 System.out.println("Here Simple Interest");
 System.out.print("Enter amount:");
 double P=sc.nextDouble();
 System.out.print("Enter rate:");
double R=sc.nextDouble();
 System.out.print("Enter time:");
double T=sc.nextDouble();
 double SI= (P*R*T)/100;
System.out.println("Simple Interest:"+SI);


}
}
