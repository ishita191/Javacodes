import java.util.Scanner;
public class Array2DInput {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter value for array");
	int a[][]= new int[3][4];

	for(int x=0;x<a.length;x++) {
		System.out.println("Enter values for Array ");
		for(int y=0;y<a[x].length;y++) {
			a[x][y]=sc.nextInt();
		}
	}
	
//	System.out.println("Entered Array Values Are:");
//	for(int y[]:a) {
//	}
}
}

