import java.util.*;
class A {
	String name="RAM";
	int age=12;
//	public String toString() {
//		return name+""+age;
//	}
}
class HashSet2{
	public static void main(String[] args) {
		HashSet a= new HashSet();
		a.add("ram");
		System.out.println(a.add(new String("ram")));
		System.out.println(a.add("ram"));
		a.add(12);
		System.out.println(a);
		System.out.println(a.add(12));
		a.add(new A());
		System.out.println(a.add(new A()));
				
	System.out.println(a);
	
	}
}


