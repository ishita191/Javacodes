
public class StringEx4 {
public static void main(String[] args) {
	String a= "Ishita";//pool memory
	String b= "Ishita";
	System.out.println(a==b);
	System.out.println(a.equals(b));
	String c=new String("Ishita");// heap memory
	System.out.println(a==c);
	System.out.println(a.toUpperCase());
	System.out.println(a.equals(c));
	a=null;
	c="panchal";
	System.out.println(c.equals(a));
	String s1="rinkita";
	String s2=new String("panchal");
	System.out.println(s1.equals(s2));
	s1="ishita";
	s2=null;
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s1));
	
	
	
	
	
}}