
public class Array2DEx {
public static void main(String[] args) {
	int [][]a= {
	{3,4,5,7},
	{6,7,8,9},
	{3,5,6,9}
	};
	int b[][]= { {3,4,5,7},
			{6,7,8,9},
			{3,5,6,9}};//allowed
	int []c[]= {{3,4,5,7},
			{6,7,8,9},
			{3,5,6,9}};//allowed
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}System.out.println(a);/*2d array k liye alg class banti h jvm m [[I*/
   }
}
