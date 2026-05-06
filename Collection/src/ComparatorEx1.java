import java.util.*;
class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	private int Salary;
	
	Emp(int id,String name,int Salary)
	{
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	@Override
	public String toString()
	{
		return id+" "+name+" "+ Salary+"";
	}
	public int compareTo(Emp o)
	
	{
	//return this.id-o.id;	
	return o.id-this.id;
//	return o.name.compareTo(this.name);
	//return this.name.compareTo(o.name);
	}
	
}

public class ComparatorEx1 {
public static void main(String[] args) {
	
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(45);
	a.add(90);
	System.out.println(a);
ArrayList b =new ArrayList();
b.add(new Emp(10,"ishita",29));
b.add(new Emp(13, "sukesh", 89));
//System.out.println(b);
Collections.sort(b);
System.out.println(b);
	
	
}
}
