class Parents{
	String name ="Hello from Parents";
	Parents()
	{
		System.out.println(name);
	}
	
}
class Child extends Parents{
	String name="Hello from child";
	Child(){
		super();
		System.out.println(name);
	}
}

public class javaTestq1 {
	
	public static void main(String args[]) {
		Child obj =new Child();

	}
}



