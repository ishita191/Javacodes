class Vehicle{
	void start() {
		System.out.println("Vehicle Start");
	}
}
class Car extends Vehicle{
	void CarInfo() {
		System.out.println("This is a Car");
	}
}
class bike extends Vehicle{
	void bikeInfo() {
		System.out.println("This is a Bike");
	}
}
public class Hierarchicalnheritance {
public static void main(String[] args) {
	Car c = new Car();
	c.CarInfo();
	c.start();
	bike b = new bike();
	
	b.bikeInfo();
 b.start();
}
}
