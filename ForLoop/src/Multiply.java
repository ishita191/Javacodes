
public class Multiply {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
 System.out.print("enter a no:");
 int n=sc.nextInt();
	int mul=1;
	for(int i=1; i<=n; i++) {
		mul*=i;
		System.out.println("product  "+mul);
	}
	
}
}
