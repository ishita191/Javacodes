import java.util.*;
public class ArrayList1 {
public static void main(String[] args) {
	ArrayList<Object> t=new ArrayList<>();
	t.add(10);
	t.add("Ram");
	t.add(null);
	t.add(null);
	t.add(22);
	t.add(10);
	t.remove((Integer)10);
	System.out.println(t.set(0,56));
	//System.out.println(t.get(6));
	System.out.println(t);
}
}
