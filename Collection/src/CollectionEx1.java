import java.util.*;
public class CollectionEx1 {
public static void main(String[] args) {
	ArrayList a=new ArrayList(50);
	
	a.add(10);
	a.add(20);
	System.out.println(a.size());
	System.out.println(a);
	//System.out.println(a.previous());
	
	
	ListIterator r=a.listIterator();
	while(r.hasPrevious())
	{
	 System.out.println(r.next()); 
	 System.out.println(r.previous());
	 //System.out.println(r.next());
	 
	 //System.out.println(r.next());
	}
	
	
	
	
}
}
