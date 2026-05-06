class Addition{
	void add(int x,int y)
	{
		int r= x+y;
		System.out.println(r);
	}
	void add(String x,String y)
	{
		String r = x+y;
		System.out.println(r);
	}
	void add(double x,double y) {
		double r= x+y;
		System.out.println(r);
	}
}
public class CompileTimepolymorphismex {
public static void main(String[] args) {
	Addition a = new Addition();
	a.add(2.4, 5.6);
	a.add(3, 7);
	a.add(34, 98);
	a.add("IShita","panchal");
	
}
}
