class Elder{
	void showElder() {
		System.out.println("Elder method");
	}
}
class younger extends Elder{
	void showyounger() {
		System.out.println("Younger method");
	}
}
class Children extends younger{
	void showChildren() {
		System.out.println("children method");
	}
}
public class MultilevelInheritance {
public static void main(String[] args) {
	Children child = new Children();
	
    child.showElder();
    child.showyounger();
child.showChildren();
	
}
}
