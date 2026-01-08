class P{
	
}
class Q{
	
}
class R extends P{
	
}
class S extends R{
	
}
public class InstanceOfClass {
public static void main(String[] args) {
	P p= new P();
	R r = new R();
	System.out.println(p instanceof P);
	System.out.println(r instanceof P);
	System.out.println(p instanceof R);
	System.out.println(r instanceof R);
	
}
}
