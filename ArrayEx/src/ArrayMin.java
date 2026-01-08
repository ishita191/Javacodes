public class ArrayMin {
public static void main(String[] args) {
	int a[]= {2,4,67,1,4};
	int min=a[0];
	for(int i=0; i<a.length; i++)
	{ if(a[i]<min)
	{
		min=a[i];
	}
	}
		System.out.println("Minimum value in that array is: "+min);


}
}
