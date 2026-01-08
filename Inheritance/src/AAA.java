class BBB{
	int x=10;
	BBB()
	{
		super();
		System.out.println("hii A");
    }
void m1() {
		System.out.println("Hello b");
	}
}
class CCC extends BBB
{ int y=20;
 CCC(){
  super();
  System.out.println("HII C");
}

void m2()
	{
		System.out.println("Hello D");
	}
}
public class AAA {
public static void main(String[] args) {
	BBB b=new BBB();
	CCC c=new CCC();
	
}
}
