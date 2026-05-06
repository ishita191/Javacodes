import java.util.*;
class HashMapex1 {
public static void main(String[] args) {
	HashMap a = new HashMap<>();
	a.put("ishita","null");
	a.put("ishita", 10);
	a.put(1, "ishita");
	a.put("xyz", "pqr");
	a.put("pqr", 24);
	
	System.out.println(a.get(10));
	System.out.println(a);
	Set s = a.entrySet();
	
	
}
}
