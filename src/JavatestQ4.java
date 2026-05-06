class E{
	int x=10;
	E(int x){
		this.x=x;	
	}

}
class F extends E{
	int x=20;
	F(int x)
	{
		super(x);
	}
	void display() {
		System.out.println("value of X in B:"+x);
		System.out.println("value of X in A:"+super.x);
	}
}
public class JavatestQ4 {
public static void main(String[] args) {
	F obj = new F(30);
	obj.display();
	
}
}
