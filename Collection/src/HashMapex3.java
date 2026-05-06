import java.util.*;
public class HashMapex3 {
public static void main(String[] args) {
	HashMap a = new HashMap();
	 a.put(1 , " ishita");
	 a.put("xyz ", 2);
	 a.put("pqr " , " ghi");
	 a.put(7.2 , " ijk");
	 
System.out.println(a);
//Set s = a.entrySet();
//for(Object o:s) {
//	System.out.println(o);
//}

Set s1 = a.keySet();
Iterator i = s1.iterator();
while(i.hasNext())
{
	System.out.println(i.next()+" ="+ a.get(i.next()));
}
}
}
