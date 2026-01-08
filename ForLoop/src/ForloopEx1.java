
public class ForloopEx1 {
public static void main(String[] args) {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.print("Enter a number:");
int n=sc.nextInt();
int sum=0;

for(int a=1; a<=n; a++){
   sum+=a;
   System.out.print(a);
   if(a<n) {
	   System.out.print(" + ");   
   }
 
}
System.out.print(" = "+sum);

}
}
