
public class VarArgsEx3 {
	public static void main(String[] args) {
		
		add(1,2,3,4,5);
		
	}
	static void add(int ... a) {
		int mul=1;
		for(int x:a) {
			mul*=x;
		}
		System.out.println("MuLTiplication: "+mul);
	}
}


