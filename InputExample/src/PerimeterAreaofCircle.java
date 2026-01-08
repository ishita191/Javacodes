public class PerimeterAreaofCircle {

	public static void main(String args[]) {

	java.util.Scanner sc= new java.util.Scanner(System.in);
	System.out.print(" Enter the radius of Circle:");
	double r=sc.nextDouble();
	
	double Perimeter=2*22/7*r;
	
	double Areaofcircle=22/7*r*r;
	
	System.out.println(" Perimeter of Circle: "+Perimeter);
	System.out.println(" Area of Circle: "+Areaofcircle);
	
	sc.close();
	
	
}
	
}
