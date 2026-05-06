interface M{
	void m();
	private void pqr(){
		// call on class only not outside of a class.
		System.out.println("private hello guys");
		
	}
	private static void xyz() {
		System.out.println("private static HELLO");
	}
	static void abc()
	{
		System.out.println("hello ABC Static");
	}
	default void MNO() {
        System.out.println("HELLO ETERNAL CODER:");
        pqr();
        xyz();
        abc();
	}
}
	
class N implements M{
	public void m() {
		System.out.println("HELLO CODER WELCOME");
		MNO();
}
	}

public class PrivateMethodInterface {
public static void main(String[] args) {
	N n = new N();
	M.abc();
	n.MNO();
	
	n.m();
//	n.pqr();
//	n.xyz();
}
}
