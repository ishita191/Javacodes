
public class Factorial {
	public static void main(String[] args) {
	 java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    int num=1;
    for(int a=1; a<=n; a++){
      num=num*a;
         }
    System.out.println( "Factorial of "+n+ " is " +num);
	}
}
