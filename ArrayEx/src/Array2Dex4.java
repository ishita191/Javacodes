
public class Array2Dex4 {
public static void main(String[] args) {
	//int b[]= {4,5,6,7};
	int a[][]= {{3,4,5,6}, {4,5,6,7},
			{8,6,3,2}};
	System.out.println(a);// 2D ARRAY ADDRESS INT TYPE [[I
	for(int x:a[0]) {
		System.out.print(x+" ");
	}
	System.out.println();

	for(int x:a[1]) {
		System.out.print(x+" ");
	}System.out.println();
	
	for(int x:a[2]) {
		System.out.print(x+" ");
	}System.out.println();
	System.out.println(java.util.Arrays.deepToString(a));
}


	
}
