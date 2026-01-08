public class BitwiseEx1 {
public static void main(String args[])
{
	int a=5,b=3;
	int r=a&b;
	System.out.println(r);
	 r= a|b;
	System.out.println(r);
	//System.out.println("size of integer"+(Integer.SIZE/8));
	r= a^b;
	System.out.println(r);
	r=a>>1;
	System.out.println(r);
	r=a<<1;
	System.out.println(r);
	r=~a;
	System.out.println(r);
}
}
