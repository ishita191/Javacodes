import java.util.*;
class Empl implements Comparable<Empl>
{
	private int id;
	private String name;
	private int marks; 

Empl(int id, String name, int marks)

{
	this.id=id;
	this.name=name;
	this.marks=marks;


}
public String toString()
{
	return id+ " "+name+ " "+marks+" ";
}

public int getid()
{
	return id;
	}
public int getmarks() {
	return marks;
}
public String getname() {
	return name;
}
@Override
public int compareTo(Empl o) {
	// TODO Auto-generated method stub
	return 0;
}
}

public class ComparableEx2 {
public static void main(String[] args) {
	ArrayList<Empl> b= new ArrayList();
	b.add(new Empl(90, "ishitaPanchal", 67));
	//b.add(new Empl(9, "RinkitaPanchal", 678));
	b.add(new Empl(4, "tanishPanchal", 74));
System.out.println(b);
//Collections.sort(b(e1, e2)->. );



}
}
