
public class ArrayEx3 {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("Enter Size of array:");
	int n= sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {// 
		System.out.print("Enter a[" + i +"]  value:");
		a[i]=sc.nextInt();
		
	}
	for(int i=0;i<a.length;i++) {
		System.out.println("a[" + i + "] =" + a[i]);
		//System.out.println(a[i]);
	}
	
}
}
