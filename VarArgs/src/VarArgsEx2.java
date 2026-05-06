
public class VarArgsEx2 {
public static void main(String[] args) {
	show(6.90 ,new int[] {34,55,78,56,89,78});
	
}
static void show ( double b,int a[]) {
	

System.out.println(b);
for(int x:a)
{
	System.out.println(x+" ");
}

}
}
