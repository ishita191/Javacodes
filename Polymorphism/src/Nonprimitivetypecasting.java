class A1{
	
}
class B1 extends A1{
	
}
class C{
	
}
public class Nonprimitivetypecasting {

	public static void main(String[] args) {
		//B1 b=new B1();
		//A1 a=b;			//Upcasting
		A1 a1=new B1();  //Upcasting
		
//		B1 b1=new A1();  //C.T.E
//		B1 b1=a1;       //C.T.E
		B1 b1=(B1)a1;    //Doowncasting
		
//		B1 b2=(B1)new A1();   //ClassCastException
//		B1 b2=(B)new C();     //C.T.E
		
	}
}



