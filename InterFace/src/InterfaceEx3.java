interface Animal{
	void eat();
}
interface Dog extends Animal{
	default void bark() {
		System.out.println("dog Bark");
	}
}
class Cat implements Animal, Dog{
public void eat() {
	System.out.println("Animal eat food");
}
	
}
public class InterfaceEx3 {
public static void main(String[] args) {
	Cat cat= new Cat();
	cat.bark();
	cat.eat();
}
}
