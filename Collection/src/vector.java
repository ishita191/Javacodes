class xyz{
	int a,b,c;
	void Add(int x,int y, int z) {
		this.a=x;
		this.b=y;
		this.c=z;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}

public class vector {

	public static void main(String[] args) {
		
		xyz a = new xyz();
          a.Add(6, 7, 8);	
		   xyz b =new xyz();
		   b.Add(7, 8, 6);
		 xyz c = new xyz();
		 c.Add(78, 56, 67);
		
		System.out.println(a);
		
		
	}
}
