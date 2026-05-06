interface AA{
	void eat();
}
interface DE extends AA{
	void study();
}
class students implements DE{
	public void eat() {
		System.out.println("Eat food");
	}
	public void study() {
		System.out.println("Study do at time");
	}
	public void Food() {
		System.out.println("EAten food");
	}
}
public class InterfaceEx1{
	public static void main(String[] args) {
		students s = new students();
		s.eat();
		s.study();
		s.Food();
		students s1= new students();
		s1.Food();
		s1.eat();
		s1.study();
		AA a = new students();
		a.eat();
		
	}
}