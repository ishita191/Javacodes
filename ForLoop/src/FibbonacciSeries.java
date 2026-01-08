public class FibbonacciSeries {
public static void main(String[] args) {
java.util.Scanner sc =new java.util.Scanner (System.in);
int first=0,second=1;
System.out.println("enter a no:");
int n=sc.nextInt();
System.out.println("Fibonacci Series upto :" +n+ " terms    ");
for(int i=1; i<=n; i++) {
	System.out.println(+first);
	int next=first+second;
	first=second;
	second=next;
}




}
}
