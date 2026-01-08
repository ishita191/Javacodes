public class ArrayAnonymous{
	public static void main(String[] args) {
		show(new int[]{8,3,10,5,7,2,4,5,1,5});//anonymous array
	}
	static void show(int a[]) {
		for(int x:a) {
			System.out.print(x);
		}
		
		for(int x:new int[]{8,3,10,5,7,2,4,5,1,5}) { //anonymous array
			System.out.println(x);
		}
	}
}
