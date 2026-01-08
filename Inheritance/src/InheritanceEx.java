class AB{
	int x=10;
	static int h=10;
	private int z=40;
	public void showz() {
		System.out.println(z);
	}
	void m1()
	{
		System.out.println("Hello a");
	}
}
class DA extends AB{
	int y=20;
	void m2()
{ 
		System.out.println("hello B");
		System.out.println(x);
		System.out.println(h);
		System.out.println(y);
	//	System.out.println(z); private variable are inherited but not accessible
		showz();
		}
}

public class InheritanceEx{
public static void main(String[] args) {
	AB a =new AB();
	a.x=18;
	a.h=45;
	System.out.println(a.x);//18
	System.out.println(a.h);//45
	a.showz();//40
	a.m1();//hello a
	System.out.println("------------");
	DA b = new DA();
	System.out.println(b.x);//10
	System.out.println(b.h);//45
	System.out.println(b.y);//20
	b.showz();//45
	b.m1();//hello a
	b.m2();//hello b,18,45,20
}	
}