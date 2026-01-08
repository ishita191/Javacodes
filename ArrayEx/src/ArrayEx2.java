
public class ArrayEx2 {
public static void main(String[] args) {
	int a[]= {4,5,67,8,9};
	//System.out.println(a[4]);
	System.out.println("even no print in that array");
	for(int i=0; i<a.length; i++ ) {
	if(a[i]%2==0) {
		System.out.println(a[i]);
	}
	}
	System.out.println("odd number print from array");
	
	
	
	for(int i=0; i<a.length; i++) {
		if(a[i]%2==1) {
			System.out.println(a[i]);
		}
	}
	
}
}
