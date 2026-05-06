import java.util.*;
public class CollectionEx2 {
public static void main(String[] args) {
	Vector a =new Vector();
	a.add(23);
	a.add(45);
	a.add(45);
	a.add(90);
	//System.out.println(a);
	
	
//	
	Iterator i= a.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
		i.remove();
		
	}
	System.out.println(a);
	Enumeration e= a.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
		//e.remove();//not present
	}
	
}
}
