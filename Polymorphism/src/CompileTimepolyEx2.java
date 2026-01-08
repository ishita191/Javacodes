class sum{
	static void add(String x, String y)
	{
		String r=x+y;
		System.out.println("Concatenation = " +r);
	}
	void add(double x, double y)
	{
		double r= x+y;
		System.out.println("sum = "+r);
	}
}
class Additionnn extends sum{
	void add(int x, int y)
	{
		int r=x+y;
		System.out.println("Add = "+r);
	}
}
public class CompileTimepolyEx2 {
public static void main(String[] args) {
	Additionnn a =new Additionnn ();
	a.add(46, 78);
	a.add(3.6, 8.9);
	a.add("ISHITA"," PANCHAl ");
	a.add(45,8);
}
}
