
public class Reversed {
public static void main(String[] args) {
java.util.Scanner sc =new java.util.Scanner(System.in);
System.out.println("ENTER A NUMBER:");
int n=sc.nextInt();
int rev=0;
for(;n>0;n/=10) {
	int r=n%10;
	rev=rev*10+r;
	
}
System.out.println("REVERSED NUMBER IS"+rev);

}
}