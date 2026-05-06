interface I{
	 abstract int sum(int a, int b);
}
public class LambdaFunctionEx2 {
public static void main(String[] args) {
	I i= (x,y)->{
		int r= x+y;
		return r;
		
	};
	int result=i.sum(4, 8);
	System.out.println("Sum is : "+result);
}
}
