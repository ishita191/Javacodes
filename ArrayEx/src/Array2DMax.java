public class Array2DMax {
public static void main(String[] args) {
	int a[][]= {
			{3,4,5,7},
			{6,7,8,10},
			{3,5,6,9}
	};
	int max=a[0][0];
	
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++)
		{
			if(a[i][j]>max) {
				max=a[i][j];
			}
		}
		
	}System.out.println("Maximum element in 2d array is:"+max);
	
	}
}
