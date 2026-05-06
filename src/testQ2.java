class A{
	int num=10;

}
class B extends A{
	int num=20;
	void display() {
		System.out.println(super.num);
	}
}
public class testQ2 {
 public static void main(String[] args) {
	B b =new B();
	b.display();
}
}
