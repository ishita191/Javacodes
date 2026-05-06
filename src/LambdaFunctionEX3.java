interface square{
 int  square(int a);
}
public class LambdaFunctionEX3 {
public static void main(String[] args) {
	square s =(a)->{
		
		return a*a;
	};
//	square s =a-> {
//		return a*a;
//	};
//	square s =a-> a*a;
//	
 int result=s.square(9);
	System.out.println("square root i: "+result);
	
	
	
	
}
}

