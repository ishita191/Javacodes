
public class VarArgsEx1 {
public static void main(String[] args) { 
//	show(6,5,7);
//
	show(new int[] {5,3,2,6,4,8});
	show(5,79,8,9,76,56,78);
}

	static void show(int ... a) {
for(int x:a) {
	System.out.println(x+" ");
}
	System.out.println();
}


}
