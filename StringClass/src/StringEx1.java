public class StringEx1 {
public static void main(String[] args) {
	String s = "Ishita";
	String s1= new String("Panchal");
	String s2= "coder";
	String s3= new String ("Eternal");
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s==s1);
	System.out.println(s==s3);
	System.out.println(s==s2);
	System.out.println(s1==s3);
	s=s.concat("student");
	System.out.println(s);
	s1=s1.concat("Universal");
	System.out.println(s1);
}
}
