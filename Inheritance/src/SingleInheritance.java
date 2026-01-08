class Grandfather{
	
	void Display()
	{
		System.out.println("HeLlo Uncle");
	}
}
class Parent extends Grandfather{
     
	void show() {
		//super.show();
		System.out.println("HEllO PAPA");
	}

	
}

public class SingleInheritance {

	public static void main(String[] args) {
		Parent parent =new Parent();
		parent.show();
		parent.Display();
		//		
	}
}
