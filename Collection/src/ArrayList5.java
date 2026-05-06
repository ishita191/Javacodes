import java.util.*;
class A{
	 String name="Ishita";
	 int age=12;
	 public String toString()
	 {
		 return name+" "+age;
	 }
	
	
}
public class ArrayList5 {
public static void main(String[] args) {
	HashSet a=new HashSet();
	System.out.println(a);
	
	System.out.println(a.add("ram"));
	System.out.println(a.add(new String("ram")));
       a.add(15);
System.out.println(a.add(15));
//System.out.println(a.add(new String(15)));
	//System.out.println(a.add(new A()));
	a.add(new A());
	a.add(3.2);
	System.out.println(a);
	
	
}
}
