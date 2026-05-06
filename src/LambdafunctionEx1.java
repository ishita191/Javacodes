interface PQR{
	void p(int x, int y);
	
}
public class LambdafunctionEx1 {
public static void main(String[] args) {
	PQR p=(int x , int y)->{
		 {
        		System.out.println("Sum is equal to x and y is: "+(x+y));
		}
	};
	p.p(6, 7);
	p.p(10,20);
	//2nd object
	PQR pp =(int x, int y)->{
		System.out.println("subtraction is equal to "+(x-y));
	};
	pp.p(56, 2);
	
	
	PQR q = (int x, int y)->{
		System.out.println("hello world");
	};
	q.p(6, 8);
	
	PQR s=(int h, int y)->{
		int i =h*y;
		System.out.println("multiplication is "+(i));
	};
	s.p(17,4);
	
	
	
}
}
