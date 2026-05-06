

// Is it possible to have main method in more then one class in a program?
// Answer: YES

class B {
    static public void main(String []s){
        System.out.println("Ram");
    }
}

class A {
    static public void main(String a){
        System.out.println("Hello");
    }
}
public class MainmethodEx3{
	public static void main(String[] args) {
		B b= new B();
		
	}
}