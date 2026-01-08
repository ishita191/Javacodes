
public class StringEx3 {
public static void main(String[] args) {
	String s="Ishita";
	s=s.concat(" panchal");
System.out.println(s);
	String s1= new String("Eternal coder");
	s1=s1.intern();
	System.out.println(s1);
	System.out.println(s1.equals(s));
	
}
}
