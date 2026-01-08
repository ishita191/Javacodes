
public class Palindrome {
public static void main(String[] args) {
java.util.Scanner sc =new java.util.Scanner(System.in);
System.out.print("Enter a number:");
int num=sc.nextInt();
int reversed=0;
int originalnum=num;
while(num>0) {
int r= num%10;
reversed=reversed*10+r;
num/=10;
}
//for(  ;num>0; num/=10) {
//	int r=num%10;
//	reversed= reversed*10+r;
//}
if(originalnum==reversed) {
	System.out.println(+originalnum+" is a Palindrome Number.");
}
else {
	System.out.println(+reversed+" is a reversed Number that is not a palindrome Number.");
}

}
}
