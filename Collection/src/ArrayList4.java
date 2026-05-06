import java.util.*;
class ArrayList4{
	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(18);
		a.add(17);
		a.add(18);
		a.add(13);
		a.add(4);
		a.add(18);
		
		System.out.println(a);

		
		Iterator <Integer>i=a.iterator();
		
			while(i.hasNext()) {
				
			if(i.next() == 18)
			{
				i.remove();  
			}
			}
			System.out.println(a);
			
		
	}
}