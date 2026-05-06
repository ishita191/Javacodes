import java.util.*;
public class HashMapex2 {
public static void main(String[] args) {
	HashMap b= new HashMap();
	b.put(1, "Ram");
	b.put(2, "ishita");
	System.out.println(b.put(1, "Ram"));
	System.out.println(b.put(2, "ishita"));
	//for(HashMap.Entry entry: b.keySet()) {
		Set s = b.entrySet();
		for(Object o:b.values())
		{
			System.out.println(o);
		
	}
//	Iterator i = s.iterator();
//	while(i.hasNext())
//	
//	{
//	System.out.println(i.next());	
//	}
	Set s1 =b.keySet();
	Iterator i2 = s1.iterator();
	while(i2.hasNext()) {
		System.out.println(i2.next());
	}
	
	//Set s3=
	
	
	
	
	
}
}
