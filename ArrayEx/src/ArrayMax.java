
public class ArrayMax {
public static void main(String[] args) {
	int a[]= {2,78,34,234,3};
	int max1= a[0];
	int max2 = a[0];
	for(int i=0; i<a.length; i++) {
	if(a[i]>max1)
	{
		{max1=a[i];}
	}
	
	}
	System.out.println("maximum element:"+max1);
	

	for(int i=0; i<a.length; i++) {
		if(a[i]>max2 && a[i]<max1) {
			{max2 =a[i];}
		}
	}
	System.out.println("maximum elemet 2"+max2);
}
}
