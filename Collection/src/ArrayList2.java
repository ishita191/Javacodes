//WAP to remove duplicate in arraylist and print that repeat element only one time
import java.util.*;

public class ArrayList2 {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<>();
	a.add("RAM");
	a.add("Sita");
	a.add("RAM");
	a.add("lakhan");
	// System.out.println("old list"+a);
	ArrayList <String> b =new ArrayList<>();
	for(int i=0; i<a.size(); i++)
	{
		String val = (String) a.get(i);
		
	
	if (!b.contains(val)) {
        b.add(val);
    }
	}
	 
    System.out.println("new list"+b);

    Iterator i = a.iterator();
    while(i.hasNext())
    {
    	if(i.next()=="RAM")
    	{	
    	i.remove();
    }
    }
    System.out.println(a);
}
}
