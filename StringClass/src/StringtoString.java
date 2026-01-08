class my{
int x=10;
String y="Ishita";
void fun() {
	System.out.println("vAkue of "+x);
}
public String toString() {
	return "my class:x="+x+ "y="+y;
	
}
}
public class StringtoString {
public static void main(String[] args) {
	my m = new my();
	System.out.println(m);
}
}
