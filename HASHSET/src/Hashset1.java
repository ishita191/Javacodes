
import java.util.concurrent.CopyOnWriteArrayList;
public class Hashset1 {
public static void main(String[] args) {
	CopyOnWriteArrayList a= new CopyOnWriteArrayList();
	a.add("ram");
	a.add("sita");
	a.add("ram");
	//a.contains("sita");
	System.out.println(a);
//	System.out.println(a.isEmpty());
	System.out.println(a.contains("sita"));
	System.out.println(a.size());
	for(Object o:a)
	{
		a.add("ishita");
	System.out.println(a);
	//System.out.println(o);

	}
//	Iterator i=a.iterator();
//	while(i.hasNext())
//		
//	{
//		Object o = i.next();
//		System.out.println(o);
//		//i.remove();
//	}
//	//System.out.println(a);
}
}
