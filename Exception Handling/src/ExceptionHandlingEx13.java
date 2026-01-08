class A{
	
}
class B extends A{
	
}
public class ExceptionHandlingEx13 {
public static void main(String[] args) {

try {
	A a= new A();
	 B b=(B)a;

}
catch(ClassCastException  e)
{
	System.out.println(e);
	
}
}
}
