import java.util.*;
public class HashSet3 {
public static void main(String[] args) {
	

//		HashSet a=new HashSet();//stores objects randomly
		LinkedHashSet a=new LinkedHashSet();//subclass of HashSet :stores objects with sequence
		a.add(10);
		a.add("sita");
		a.add(12);
		a.add(34);
		a.add("ram");
		a.add(10);
		System.out.println(a);
		a.remove(12);//remove a/c object
//		a.remove((Integer)12);//remove a/c object
		System.out.println(a);
		
}
}
