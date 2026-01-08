class A{
	int x=90;
	void show() {
		System.out.println(x);
	}
}
public class Array2DEx3 {
public static void main(String[] args) {
//	A a= new A();
//	A b = new A();
//	A  c = new A();
//	A d =new A();
//	 
	//A aa[]=new A[5];
//a[0]=new A();
//a[1]=new A();
//a[2]=new A();
//a[3]=new A();
//a[4]=new A();
A aa[]={new A(), new A(), new A(), new A()};
for(int i=0; i<aa.length; i++)
{
	aa[i]=new A();
}
aa[2].show();
aa[2].x=900000;
System.out.println(aa[2].x);
for(A k:aa) {
	System.out.println(k.x);
}


}
}
