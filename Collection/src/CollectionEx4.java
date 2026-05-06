import java.util.*;
public class CollectionEx4 {
public static void main(String[] args) {
	Queue a =new LinkedList();
	a.add("ishita");
	//a.add("panchal");
//	a.add(10);
	System.out.println(a.offer(a));
	System.out.println(a.peek());
//	System.out.println(a.poll());
	System.out.println(a.poll());
}
}

