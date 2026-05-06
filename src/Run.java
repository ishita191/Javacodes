class A{
	//super non static , static method 
	int x=10;
	void add()
	{
		System.out.println("HEllO");
	}
}
class B extends A{//sub  non static method -> overrides, static method ->hides
void add()
	 //overrides,//  data hiding
	{
		System.out.println();
	}
}
public class Run {

}
