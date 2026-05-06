interface Aa{
	void hai();
	
}
class Bb implements Aa{
	public void hai()
	{
		System.out.println();
	}
}
class Helper2{
	public Aa getA() {
		Bb b=new Bb();
		return b;
		
	}
}
public class InterfaceEx4 {
public static void main(String[] args) {
	Helper2 h= new Helper2();
	Aa a = h.getA();
	a.hai();
}
}
