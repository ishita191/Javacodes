
import java.util.*;
public class HashMapex4 {
public static void main(String[] args) {
	HashMap a =new HashMap();
	a.put("abc", 10);
	a.put(1, 7.2);
	a.put("tuv", 10);
	a.put("ghi", 12);
	a.put(2, 5);
    a.put("xyz","Ram");
	System.out.println(a);
	
	Set s= a.keySet();
	Iterator r= s.iterator();
	while(r.hasNext())
	{
		System.out.println(r.next()+"= "+a.get(r.next()));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
