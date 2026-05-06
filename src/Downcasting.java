class Vehicle {
    void Engine() {
        System.out.println("Vehicle class");
    }
}

class Car extends Vehicle {
    void bark() {
        System.out.println("Car class");
    }
}

public class Downcasting {
    public static void main(String args[]) {

        Vehicle v = new Car();  // Up casting Storing child object to parents reference type 
        v.Engine();

       // Car c = (Car) v;        // Down casting parents refernce to convert child refernce
       // c.bark();
    }
}
