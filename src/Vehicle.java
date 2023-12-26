
public class Vehicle {
	double speed;
	
	void go() {
		System.out.println("this vehicle is moving");
	}
	void stop() {
		System.out.println("this vehicle is stopped");
	}
	
}

class Car extends Vehicle{
	
	int wheels=4;
	int doors=4;
}
class Bicycle extends Car{
	int wheels=2;
	int pedals=2;
}